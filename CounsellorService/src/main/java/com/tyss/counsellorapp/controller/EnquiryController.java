package com.tyss.counsellorapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.counsellorapp.service.EnquiryService;

@RestController
@RequestMapping("/enq")
public class EnquiryController {

	@Autowired
	private EnquiryService enquiryService;
}
