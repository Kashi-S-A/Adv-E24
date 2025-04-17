package com.ty;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Delete {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employee emp = em.find(Employee.class, 101);
		
		if (emp!=null) {
			
			et.begin();
			em.remove(emp);//delete
			et.commit();
			
			System.out.println("deleted");
			
		} else {
			System.out.println("Not found");
		}
	}
}
