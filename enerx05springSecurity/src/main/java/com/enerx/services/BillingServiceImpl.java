package com.enerx.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enerx.entities.Billing;
import com.enerx.repositories.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired
	BillingRepository billRepo;

	@Override
	public void saveBilling(Billing billings) {
	billRepo.save(billings);
	}

	@Override
	public List<Billing> listall() {

		List<Billing> billings = billRepo.findAll();
		return billings;
		
	}

}
