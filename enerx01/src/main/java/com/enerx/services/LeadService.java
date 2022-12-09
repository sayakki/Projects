package com.enerx.services;

import com.enerx.entities.Lead;

public interface LeadService {
	public void saveLead(Lead lead);
	public Lead getLeadById(long id);
	public void deleteOneLead(long id);
}
