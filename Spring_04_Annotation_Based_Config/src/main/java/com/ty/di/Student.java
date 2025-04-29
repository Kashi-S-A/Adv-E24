package com.ty.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//setter injection
public class Student {

	private int sid;

	private String name;

	@Value(value = "Cohelo")
	public void setName(String name) {
		this.name = name;
	}

	@Value(value = "101")
	public void setSid(int sid) {
		this.sid = sid;
	}

	public void display() {
		System.out.println("SID : "+sid);
		System.out.println("Name : "+name);
	}
}
