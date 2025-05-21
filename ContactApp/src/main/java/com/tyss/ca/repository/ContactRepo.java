package com.tyss.ca.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyss.ca.entity.Contact;


public interface ContactRepo extends JpaRepository<Contact, Integer>{

	Optional<Contact> findByPhone(Long phone);
}
