package com.ty.di;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Person person = (Person) app.getBean("person");
		
		person.display();
		
		System.out.println("==========================");
		
		Student student = (Student) app.getBean("student");
		
		student.display();
		
		System.out.println("===========================");
		
		Bike bike = (Bike) app.getBean("bike");
		
		bike.display();
		
	}
}
