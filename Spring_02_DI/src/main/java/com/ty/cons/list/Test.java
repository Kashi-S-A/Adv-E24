package com.ty.cons.list;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("consList.xml");
		
		Student student = (Student) app.getBean("myStudent");

		student.display();
	}
}
