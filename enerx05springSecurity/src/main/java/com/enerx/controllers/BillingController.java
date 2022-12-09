package com.enerx.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.enerx.entities.Billing;
import com.enerx.entities.Contact;
import com.enerx.services.BillingService;
import com.enerx.services.ContactService;


@Controller
public class BillingController {
	
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private BillingService billingService;
	
	
	@RequestMapping("/generateBill")
	public String viewBillingPage(@RequestParam("id") long id,ModelMap modelMap)
	{   
		Contact contact = contactService.findContactById(id);
		modelMap.addAttribute("contact", contact);
		return "create_bill";
	}

	@RequestMapping("/saveBill")
	public String saveOneBill(@ModelAttribute("billings") Billing billings,ModelMap model) {
		billingService.saveBilling(billings);
		model.addAttribute("billings",billings);
		return "billing_Info";
	}
	
	@RequestMapping("/listbillings")
	public String getAllBills(ModelMap model) {
		List<Billing> billings = billingService.listall();
		model.addAttribute("billings", billings);
		return "billing_search_result";
	}
}
