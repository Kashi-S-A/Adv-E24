package com.ty;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Subject {

	@Id
	private int sid;
	private String name;
	private int days;

	@ManyToMany(mappedBy = "subjects")
	private List<Student> students;

	@Override
	public String toString() {
		return "Subject [sid=" + sid + ", name=" + name + ", days=" + days + "]";
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
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
