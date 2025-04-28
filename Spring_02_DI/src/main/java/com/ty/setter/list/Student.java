package com.ty.setter.list;

import java.util.List;

public class Student {

	private String name;
	
	private List<String> subjects;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("------------Subjects------------");
		for (String subject : subjects) {
			System.out.println(subject);
		}
	}
}
