package com.tyss.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

	@GetMapping("/get")
	public String testMsg() {
		return "Used for fetch";
	}

	@PostMapping("/post")
	public String postMethod() {
		return "Used for Saving";
	}
	
	@PutMapping("/put")
	public String putMethodName() {
		return "Used to update multiple data";
	}

	@PatchMapping("/patch")
	public String patchMethodName() {
		return "Used to update single data";
	}
	
	@DeleteMapping("/delete")
	public String deleteMethodName() {
		return "Used to Delete";
	}
}
