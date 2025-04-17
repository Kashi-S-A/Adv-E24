package com.ty;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Insert {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Employee e = new Employee();
		e.setEid(103);
		e.setName("Laxmi");
		e.setSalary(45000);

		et.begin();
		em.persist(e);// insert record
		et.commit();

		System.out.println("Saved");
	}
}
