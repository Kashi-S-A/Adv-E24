package com.ty;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Car car = em.find(Car.class, 101);
		
		if (car!=null) {
			System.out.println(car);
			Engine engine = car.getEngine();
			System.out.println(engine);
		} else {
			System.out.println("Car not found");
		}
		
	}
}
