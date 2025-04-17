package com.ty;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Employee emp = em.find(Employee.class, 103);
		
		if (emp!=null) {
			System.out.println(emp.getEid());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
		} else {
			System.out.println("Employee Not Found");
		}
		
	}
}
