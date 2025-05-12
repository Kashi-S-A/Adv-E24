package com.tyss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

	@GetMapping("/get")
	public String getMethodName() {
		return "student record fetched";
	}

	@PostMapping("/save")
	public String postMethodName() {
		return "student is saved";
	}

	@PutMapping("/update")
	public String putMethodName() {
		return "student record is updated";
	}
}
