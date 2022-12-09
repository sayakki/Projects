package com.enerx.services;

import java.util.List;
import java.util.Optional;

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

	@Override
	public List<Contact> listAll() {
		
		List<Contact> contacts = contactRepo.findAll();
		return contacts;
	}

	@Override
	public Contact findContactById(long id) {
		
		Optional<Contact> ContactBy = contactRepo.findById(id);
		return ContactBy.get();//this will get us the Contact object
	}




}
