package com.ty.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//field or variable injection
public class Person {

	@Value(value = "Petrick")
	String name;
	
	@Value(value = "25")
	int age;
	
	@Value(value = "petrick@gmail.com")
	String email;
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Email : "+email);
	}
}
