package com.ty.di.obj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {

	@Value(value = "1000")
	int cc;
	
	@Value(value = "Petrol")
	String fuel;
	
	public void displayEngine() {
		System.out.println("Cc : "+cc);
		System.out.println("Fuel : "+fuel);
	}
	
}
