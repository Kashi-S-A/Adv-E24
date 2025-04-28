package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver1 {

	public static void main(String[] args) {
		
		//J2EE container
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		
		Person person = (Person) ac.getBean("myPerson");
		
		person.play();
	}
}
