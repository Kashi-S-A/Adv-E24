package com.ty.autowiredoninterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "myPerson")
public class Person {

	@Autowired
	Mobile mobile;
	
	public void use() {
		System.out.println("Person is using mobile");
		mobile.ringing();
	}
}
