package com.tyss.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<?> getInfo(@RequestParam(name = "id") Integer eid) {

		if (eid == 101) {
			// TODO : produce response with status code 200 OK with employee details

			Employee emp = new Employee();
			emp.setEid(eid);
			emp.setName("Shyam");
			emp.setIsPresent(true);
			emp.setSalary(80000d);

//			return new ResponseEntity<Employee>(emp, HttpStatus.OK);
			return ResponseEntity.ok(emp);

		} else {
			// TODO : produces response with status code 404 Not Found with some message
			return new ResponseEntity<String>("Employee with id " + eid + " is not present ", HttpStatus.NO_CONTENT);
		}

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

	@PostMapping(value = "/save", consumes = { "application/xml", "application/json" }, produces = { "application/xml",
			"application/json" })
	public ResponseEntity<Employee> getBodyData(@RequestBody Employee employee) {

		System.out.println(employee);

		ResponseEntity<Employee> re = new ResponseEntity<Employee>(employee, HttpStatus.CREATED);

		return re;
	}
	
	@GetMapping("/exc")
	public String handleExc() {
		
		int b[] = new int[2];
		System.out.println(b[2]);
		
		String q = "hj";
		q.charAt(5);
		
		String s = null;
		s.charAt(0);
		
		int a = 10/0;//AE
		
		return "Hi how are you";
	}
	
}
