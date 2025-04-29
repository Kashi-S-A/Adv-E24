package com.ty.cons;

public class Person {

	private String name;

	private long phone;

	public Person(String name, long phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Phone : "+phone);
	}
}
