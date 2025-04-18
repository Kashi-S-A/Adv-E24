package com.ty;

import java.util.Arrays;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class InsertExisting {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student student=new Student();
		student.setSid(102);
		student.setName("Y");
		student.setPhone(34567654);
		
		Subject sub1=em.find(Subject.class, 111);
		
		Subject sub2=em.find(Subject.class, 222);
		
		Subject sub3=new Subject();
		sub3.setSid(333);
		sub3.setName("WebTech");
		sub3.setDays(25);
		
		student.setSubjects(Arrays.asList(sub1,sub2,sub3));
		
		et.begin();
		em.persist(student);
		em.persist(sub3);
		et.commit();
		
		System.out.println("saved");
		
	}
}
