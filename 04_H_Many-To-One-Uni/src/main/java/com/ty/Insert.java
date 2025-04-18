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

		Product product = new Product();
		product.setPid(101);
		product.setName("Phone");
		product.setPrice(20000);

		Review r1 = new Review();
		r1.setRid(111);
		r1.setMsg("Good");
		r1.setProduct(product);

		Review r2 = new Review();
		r2.setRid(222);
		r2.setMsg("Bad");
		r2.setProduct(product);

		et.begin();
		em.persist(product);
		em.persist(r1);
		em.persist(r2);
		et.commit();

		System.out.println("saved");
	}
}
