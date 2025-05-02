package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		Student student = (Student) app.getBean("student");
		student.display();
		
		student.address.display();
		
		System.out.println("=======================");
		
		Address add = (Address) app.getBean("myAddress");
		
		add.display();
	}
}
