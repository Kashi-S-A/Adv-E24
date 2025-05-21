package com.tyss.ca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.ca.entity.Contact;
import com.tyss.ca.repository.ContactRepo;

@Service
public class ContactService {

	@Autowired
	private ContactRepo contactRepo;

	public Contact saveContact(Contact contact) {
		return contactRepo.save(contact);
	}

	public Contact getById(Integer cid) {
		return contactRepo.findById(cid).get();
	}

	public void deleteById(Integer cid) {
		contactRepo.deleteById(cid);
	}

}
