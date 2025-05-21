package com.tyss.ca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.ca.entity.Contact;
import com.tyss.ca.entity.User;
import com.tyss.ca.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	public boolean registerUser(User user) {
		Optional<User> opt = userRepo.findByEmail(user.getEmail());

		if (opt.isPresent()) {
			// user is already registered with given email
			return false;
		} else {
			// not registered we have to register
			userRepo.save(user);
			return true;
		}
	}

	public boolean login(String email, String password) {
		Optional<User> opt = userRepo.findByEmailAndPassword(email, password);
		return opt.isPresent();
	}

	public List<Contact> findContactsByUser(String email) {
		User user = userRepo.findByEmail(email).get();
		return user.getContacts();
	}

	public User getByEmail(String email) {
		return userRepo.findByEmail(email).get();
	}

}
