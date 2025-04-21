package com.ty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Engine {

	@Id
	private int eid;

	private String fuel;

	private double cc;

	@OneToOne(mappedBy = "engine")
	private Car car;

	@Override
	public String toString() {
		return "Engine [eid=" + eid + ", fuel=" + fuel + ", cc=" + cc + "]";
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	public Car getCar() {
		return car;
	}
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public double getCc() {
		return cc;
	}

	public void setCc(double cc) {
		this.cc = cc;
	}

}
