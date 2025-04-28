package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext cApp = new ClassPathXmlApplicationContext("config.xml");
		Student student = (Student) cApp.getBean("myStudent");
		student.study();
		
		System.out.println("--------------------------------------");
		
		Mobile mobile = (Mobile) cApp.getBean("myMobile");
		mobile.call();
		
		System.out.println("======================================");
		
		ConfigurableApplicationContext cApp1 = new ClassPathXmlApplicationContext("config1.xml");
		Student student1 = (Student) cApp1.getBean("myStudent");
		student1.study();
		
		System.out.println("--------------------------------------");
		
		Mobile mobile1 = (Mobile) cApp1.getBean("mobile");
		mobile1.call();
	}
}
