package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);

		Person person = (Person) app.getBean("person");

		person.play();

		PersonApp pApp = (PersonApp) app.getBean("personApp");

		pApp.speak();
		
		RCB rcb = (RCB) app.getBean("RCB");
		
		rcb.play();
		
		Student student = (Student) app.getBean("myStudent");
		
		student.exam();
	}
}
