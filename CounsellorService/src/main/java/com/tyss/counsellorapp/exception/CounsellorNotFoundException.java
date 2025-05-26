package com.tyss.counsellorapp.exception;

public class CounsellorNotFoundException extends RuntimeException {

	private String message;

	public CounsellorNotFoundException() {
	}

	public CounsellorNotFoundException(String msg) {
		message = msg;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
