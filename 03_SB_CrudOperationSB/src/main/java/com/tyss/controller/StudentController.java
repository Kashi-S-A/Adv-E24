package com.tyss.controller;

import java.util.List;

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

	@PutMapping("/update/{sid}")
	public ResponseEntity<Student> updateStudent(@PathVariable Integer sid, @RequestParam String name) {
		return studentService.updateStudentName(sid, name);
	}

	@GetMapping("/get")
	public ResponseEntity<Student> getStudent(@RequestParam Integer sid) {
		ResponseEntity<Student> re = studentService.getStudentById(sid);
		return re;
	}

	@GetMapping("/getall")
	public ResponseEntity<List<Student>> getStudents() {
		ResponseEntity<List<Student>> re = studentService.getStudents();
		return re;
	}

	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteStudentById(@RequestParam Integer sid) {
		return studentService.deleteStudent(sid);
	}
	
	@GetMapping("/page")
	public ResponseEntity<List<Student>> getByPage(@RequestParam Integer pageNumber) {
		ResponseEntity<List<Student>> students = studentService.getByPage(pageNumber);
		return students;
	}
	
	@GetMapping("/sort")
	public ResponseEntity<List<Student>> sortStudents(@RequestParam String param) {
		return studentService.sortStudents(param);
	}
	
	@GetMapping("/filter")
	public ResponseEntity<List<Student>> filterRecords(@RequestBody Student student) {
		return studentService.filter(student);
	}
	
	@GetMapping("/fetch")
	public ResponseEntity<List<Student>> getByStd(@RequestParam Integer std) {
		return studentService.getByStd(std);
	}
	
	
}
