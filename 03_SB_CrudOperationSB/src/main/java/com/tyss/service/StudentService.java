package com.tyss.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tyss.entity.Student;
import com.tyss.exception.StudentNotFoundException;
import com.tyss.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public ResponseEntity<Student> saveStudent(Student student) {
		Student saved = studentRepository.save(student);
		return new ResponseEntity<Student>(saved, HttpStatus.CREATED);
	}

	public ResponseEntity<Student> getStudentById(Integer sid) {
		Optional<Student> opt = studentRepository.findById(sid);
		
//		if (opt.isPresent()) {
//			//Student is present
//			Student student = opt.get();
//		} else {
//			//student is not present
//			//give message / throw exception
//		}
		
		Student student = opt.orElseThrow(()-> new StudentNotFoundException("Student Not Found"));
		
		return new ResponseEntity<>(student, HttpStatus.OK);
	}
}
