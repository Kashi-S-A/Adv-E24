package com.ty.cons;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("cons.xml");
		
		Person person = (Person) app.getBean("myPerson");
		
		person.display();
	}
}
