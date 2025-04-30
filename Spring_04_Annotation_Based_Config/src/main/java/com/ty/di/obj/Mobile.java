package com.ty.di.obj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	private String brand;
	
	private double price;
	
	private String ram;
	
	@Value(value = "Samsung")
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Value(value = "25000")
	public void setPrice(double price) {
		this.price = price;
	}
	@Value(value = "8GB")
	public void setRam(String ram) {
		this.ram = ram;
	}
	
	public void diplayMobile() {
		System.out.println("Brand : "+brand);
		System.out.println("Price : "+price);
		System.out.println("Ram : "+ram);
	}
}
