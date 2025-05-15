package com.tyss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.entity.Student;
import com.tyss.service.StudentService;


@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		ResponseEntity<Student> savedStudent = studentService.saveStudent(student);
		return savedStudent;
	}
	
//	@PutMapping("/update/{sid}")
//	public String updateStudent(@PathVariable Integer sid, @RequestParam String name) {
//		//TODO: process PUT request
//		return entity;
//	}
	
	@GetMapping("/get")
	public ResponseEntity<Student> getStudent(@RequestParam Integer sid) {
		ResponseEntity<Student> re = studentService.getStudentById(sid);
		return re;
	}
//	
//	@GetMapping("/getall")
//	public String getStudents() {
//		//TODO: logic to fetch all the students
//		return new String();
//	}
//	
//	@DeleteMapping("/delete")
//	public String deleteStudentById(@RequestParam Integer sid) {
//		//TODO: delete student by id
//		return "";
//	}
	
}
