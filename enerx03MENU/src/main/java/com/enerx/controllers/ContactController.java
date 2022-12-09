package com.enerx.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.enerx.entities.Contact;
import com.enerx.services.ContactService;

@Controller
public class ContactController {
	
	@Autowired()
	private ContactService contactService;
	
	@RequestMapping("/listcontacts")
	public String listAllContacts(ModelMap modelMap) {
		List<Contact> contacts = contactService.listAll();
		modelMap.addAttribute("contacts", contacts);
		return "contact_search_result";
	}
	
	@RequestMapping("/getContactById")
	public String getContactById(@RequestParam("id") long id,ModelMap model) {
		
		Contact contacts = contactService.findContactById(id);
		model.addAttribute("contact", contacts);
		return "contact_info";
		
	}
}
