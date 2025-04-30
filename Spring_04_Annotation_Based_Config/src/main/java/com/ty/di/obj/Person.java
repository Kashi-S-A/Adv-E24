package com.ty.di.obj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	private String name;

	private Mobile mobile;
	
	//constructor injection
	public Person(@Value(value = "Feign") String name,@Autowired Mobile mobile) {
		this.name=name;
		this.mobile=mobile;
	}

	//setter injection
//	@Autowired
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

//	@Value(value = "Demon")
	public void setName(String name) {
		this.name = name;
	}

	public void displayPerson() {
		System.out.println("Name : " + name);
		mobile.diplayMobile();
	}
}
