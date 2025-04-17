package com.ty;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Update {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Employee emp = em.find(Employee.class, 101);

		if (emp != null) {
			emp.setSalary(150000);
			emp.setName("Allen");
//			emp.setEid(103);//cannot update PK
			
			et.begin();
			Employee updated = em.merge(emp);//to update
			et.commit();
			
			System.out.println("Updated employee");
			System.out.println(updated.getEid());
			System.out.println(updated.getName());
			System.out.println(updated.getSalary());
		} else {
			System.out.println("Not found");
		}
	}
}
