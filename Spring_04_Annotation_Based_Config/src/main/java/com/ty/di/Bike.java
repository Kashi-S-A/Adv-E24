package com.ty.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//constructor
public class Bike {

	String brand;

	int cc;

	public Bike(@Value(value = "Royal Enfield") String brand,@Value(value = "350") int cc) {
		this.brand = brand;
		this.cc = cc;
	}
	
	public void display() {
		System.out.println("brand : "+brand);
		System.out.println("cc : "+cc);
	}
}
