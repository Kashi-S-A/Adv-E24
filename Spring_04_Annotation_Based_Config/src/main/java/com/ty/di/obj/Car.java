package com.ty.di.obj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Value(value = "BMW")
	String brand;
	
	@Value(value = "1000000")
	double price;
	
	@Autowired
	Engine engine;
	
	public void displayCar() {
		System.out.println("Brand : "+brand);
		System.out.println("Price : "+price);
		engine.displayEngine();
	}
}
