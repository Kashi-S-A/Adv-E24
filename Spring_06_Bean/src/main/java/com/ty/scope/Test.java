package com.ty.scope;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Laptop laptop1 = (Laptop) app.getBean("laptop");
		System.out.println(laptop1);
		
		Laptop laptop2 = (Laptop) app.getBean("laptop");
		System.out.println(laptop2);
	}
}
