package com.ty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Subject {

	@Id
	private int sid;
	private String name;
	private int days;

	@Override
	public String toString() {
		return "Subject [sid=" + sid + ", name=" + name + ", days=" + days + "]";
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

}
