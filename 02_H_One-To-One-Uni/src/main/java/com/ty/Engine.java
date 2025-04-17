package com.ty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Engine {

	@Id
	private int eid;

	private String fuel;

	private double cc;

	@Override
	public String toString() {
		return "Engine [eid=" + eid + ", fuel=" + fuel + ", cc=" + cc + "]";
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
