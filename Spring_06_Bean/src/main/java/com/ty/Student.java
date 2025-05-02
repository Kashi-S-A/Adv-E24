package com.ty;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value(value = "Denvor")
	String name;
	
	@Autowired
	List<String> subjects;
	
	@Autowired
	Address address;
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("=========Subjects===========");
		for (String subject : subjects) {
			System.out.println(subject);
		}
	}
}
