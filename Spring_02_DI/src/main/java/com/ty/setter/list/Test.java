package com.ty.setter.list;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("setterList.xml");
	
		Student student = (Student) app.getBean("myStudent");
		student.display();
	}
}
