package com.enerx.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.enerx.entities.Contact;
import com.enerx.entities.Lead;
import com.enerx.services.ContactService;
import com.enerx.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/viewleadpage")
	public String viewLeadPage() {
		return "view_lead_page";
	}
	
	@RequestMapping("/saveLead")
	public String saveOneLead(@ModelAttribute("lead") Lead lead,ModelMap model) {
		leadService.saveLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	
	@RequestMapping(value="/convertLead",method=RequestMethod.POST)
	public String convertLead(@RequestParam("id") long id) {
		
		//appliying the id and getting the data
		Lead lead=leadService.getLeadById(id);
		
		//Now taking the data from lead and initialising all
    	Contact contact=new Contact();
    	contact.setFirstName(lead.getFirstName());
    	contact.setLastName(lead.getLastName());
    	contact.setEmail(lead.getEmail());
    	contact.setLeadSource(lead.getLeadSource());
    	contact.setMobile(lead.getMobile());
    	
    	//save all the data into contact
    	contactService.saveContact(contact);
		
    	leadService.deleteOneLead(id);
    	
    	return "contact_details";
	}
}
