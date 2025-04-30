package com.ty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "myPerson")
public class Person {

//	@Autowired
//	@Qualifier(value = "iphone")
	Mobile mobile;
	
//	@Autowired
//	@Qualifier(value = "iphone")
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	
	@Autowired
	public Person(@Qualifier(value = "iphone") Mobile mobile) {
		this.mobile=mobile;
	}
	
	public void use() {
		System.out.println("Person is using mobile");
		mobile.ringing();
	}
}
