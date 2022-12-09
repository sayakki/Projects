package com.enerx.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enerx.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
