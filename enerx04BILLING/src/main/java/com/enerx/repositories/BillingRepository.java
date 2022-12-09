package com.enerx.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enerx.entities.Billing;
//import org.springframework.stereotype.Repository;


//@Repository --- not required but ok
public interface BillingRepository extends JpaRepository<Billing, Long>
  {
		
  }
