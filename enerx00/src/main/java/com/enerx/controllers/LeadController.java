package com.enerx.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LeadController {
	
	@RequestMapping("/viewleadpage")
	public String viewLeadPage() {
		return "view_lead_page";
	}
}
