package com.ty;

import org.springframework.stereotype.Component;

@Component(value = "myStudent")
public class Student {

	public void exam() {
		System.out.println("Pass in the exam");
	}
}
