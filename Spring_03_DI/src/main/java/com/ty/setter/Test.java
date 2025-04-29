package com.ty.setter;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext cApp = new ClassPathXmlApplicationContext("config.xml");

		Person person = (Person) cApp.getBean("myPerson");

		System.out.println("Name : " + person.getName());
		System.out.println("Phone : " + person.getPhone());

	}
}
