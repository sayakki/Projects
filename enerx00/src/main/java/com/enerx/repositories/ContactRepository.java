package com.enerx.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enerx.entities.Contacts.Lead;

public interface ContactRepository extends JpaRepository<Lead, Long> {

}
