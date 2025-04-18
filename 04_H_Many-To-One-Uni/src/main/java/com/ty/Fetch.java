package com.ty;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Review review = em.find(Review.class, 333);
		
		if (review!=null) {
			System.out.println(review);
			Product product = review.getProduct();
			System.out.println(product);
		} else {
			System.out.println("Not found");
		}
	}
}
