package com.enerx.services;

import java.util.List;

import com.enerx.entities.Billing;

public interface BillingService {
	public void saveBilling(Billing billings);

	public List<Billing> listall();
}
