package com.tyss.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<String> catchStudentNotFoundException(StudentNotFoundException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
