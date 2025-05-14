package com.tyss.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<String> catchArithmeticException(ArithmeticException exception) {
		return new ResponseEntity<String>("Arithmatic Exception is occured", HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String> catchNullPointerException(NullPointerException exception) {
		return new ResponseEntity<String>("cannot invoke methods with null", HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> catchException(Exception exception) {
		return new ResponseEntity<String>("something went wrong try again later", HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
