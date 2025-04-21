package com.ty;

import java.util.Arrays;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Insert {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student student=new Student();
		student.setSid(101);
		student.setName("X");
		student.setPhone(123456789);
		
		Subject sub1=new Subject();
		sub1.setSid(111);
		sub1.setName("Java");
		sub1.setDays(60);
		
		Subject sub2=new Subject();
		sub2.setSid(222);
		sub2.setName("SQL");
		sub2.setDays(20);
		
		student.setSubjects(Arrays.asList(sub1,sub2));
		
		et.begin();
		em.persist(student);
		em.persist(sub1);
		em.persist(sub2);
		et.commit();
		
		System.out.println("saved");
		
	}
}
