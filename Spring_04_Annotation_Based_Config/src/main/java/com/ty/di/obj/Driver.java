package com.ty.di.obj;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		
//		Car car = (Car) app.getBean("car");
//		
//		car.displayCar();
		
		Person person = (Person) app.getBean("person");
		
		person.displayPerson();
	}
}
