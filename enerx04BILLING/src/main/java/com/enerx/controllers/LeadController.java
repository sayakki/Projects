package com.enerx.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping("/")
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
	public String convertLead(@RequestParam("id") long id,ModelMap model) {
		
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
    	
    	List<Contact> contacts = contactService.listAll();
    	model.addAttribute("contacts", contacts);
    	
    	return "contact_search_result";
	}
	
	@RequestMapping("/listall")
	public String getAllLeads(Model map) {
		List<Lead> leads = leadService.listall();
		map.addAttribute("leads", leads);
		return "lead_search_result";
	}
	
	@RequestMapping("/getLeadById")
	public String getLeadById(@RequestParam("id") long id,ModelMap model) 
	{	
		Lead lead = leadService.getLeadById(id);//getting the lead
		model.addAttribute("lead", lead);
		return "lead_info";
	}
}