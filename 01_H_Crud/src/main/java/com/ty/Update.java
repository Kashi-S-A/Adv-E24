package com.ty;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Update {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Employee emp = em.find(Employee.class, 101);
		
		System.out.println(emp.getEid());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		
	}
}
