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

		Car car = new Car();
		car.setCid(102);
		car.setName("Benz");
		car.setPrice(500000);

		Engine engine = new Engine();
		engine.setEid(222);
		engine.setFuel("Petrol");
		engine.setCc(1500);
		
		car.setEngine(engine);

		et.begin();
		em.persist(car);
		et.commit();
		
		System.out.println("Record saved");

	}
}
