package com.tyss.counsellorapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.counsellorapp.repository.EnquiryRepository;

@Service
public class EnquiryService {

	@Autowired
	private EnquiryRepository enquiryRepository;
}
