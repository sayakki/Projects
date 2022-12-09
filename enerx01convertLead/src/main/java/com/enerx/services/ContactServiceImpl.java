package com.enerx.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enerx.entities.Contact;
import com.enerx.repositories.ContactRepository;


@Service
public class ContactServiceImpl implements ContactService {

	
	@Autowired
	ContactRepository contactRepo;
	
	@Override
	public void saveContact(Contact contact) {
           contactRepo.save(contact);
	}




}
