package com.ty;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class FetchBySubject {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Subject subject = em.find(Subject.class, 111);

		if (subject != null) {
			System.out.println(subject);
			List<Student> students = subject.getStudents();
			for (Student student : students) {
				System.out.println(student);
				System.out.println("======================");
			}
		} else {
			System.out.println("Not found");
		}
	}
}
