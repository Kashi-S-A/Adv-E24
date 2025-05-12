package com.tyss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@GetMapping
	public String getMethodName() {
		return "Emp Fetched";
	}
	
	@PostMapping
	public String getData() {
		return "Emp data Fetched";
	}
	
	@PutMapping
	public String get() {
		return "Emp data updated";
	}
}
