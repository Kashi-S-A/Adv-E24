package com.tyss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@GetMapping
	public String getInfo(@RequestParam(name = "id") Integer eid, @RequestParam String name) {
		System.out.println(eid);
		System.out.println(name);
		return "EmpId : " + eid + ", Name : " + name;
	}

	@PostMapping("/{id}/{name}")
	public String getData(@PathVariable(name = "id") Integer eid, @PathVariable String name) {
		System.out.println(eid);
		System.out.println(name);
		return "EmpId : " + eid + ", Name : " + name;
	}

	@PutMapping
	public String get(@RequestHeader String token) {
		System.out.println(token);
		return "Token : " + token;
	}

	@PostMapping(value = "/save", consumes = {
												"application/xml" ,
												"application/json"
											 }, 
								  produces = {
											"application/xml" ,
											"application/json"
											 }
	)
	public Employee getBodyData(@RequestBody Employee employee) {
		System.out.println(employee);
		return employee;
	}
}
