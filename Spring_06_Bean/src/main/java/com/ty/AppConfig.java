package com.ty;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ty")
public class AppConfig {

	@Bean
	public List<String> creatList() {
		List<String> al = new ArrayList<String>();
		al.add("Hi");
		al.add("Hello");
		al.add("How");
		return al;
	}
	
	@Bean(value = "myAddress")
	public Address createAdd() {
		Address address = new Address();
		address.houseno="1232";
		address.city="Mumbai";
		address.pincode=2345;
		return address;
	}
}
