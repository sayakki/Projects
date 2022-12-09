package com.enerx.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enerx.entities.Contact;


public interface ContactRepository extends JpaRepository<Contact, Long> {


}
