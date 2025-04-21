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
		car.setCid(101);
		car.setName("BMW");
		car.setPrice(400000);

		Engine engine = new Engine();
		engine.setEid(111);
		engine.setFuel("Petrol");
		engine.setCc(2000);
		
		car.setEngine(engine);
		engine.setCar(car);

		et.begin();
		em.persist(car);
		em.persist(engine);
		et.commit();
		
		System.out.println("Record saved");

	}
}
