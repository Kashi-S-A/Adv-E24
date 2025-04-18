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
		
		Bank bank=new Bank();
		bank.setBid(101);
		bank.setName("SBI");
		bank.setAddress("BLR");
		
		Account a1 = new Account();
		a1.setAccno(111);
		a1.setName("Allen");
		a1.setBalance(10000);
		
		Account a2 = new Account();
		a2.setAccno(222);
		a2.setName("Martin");
		a2.setBalance(20000);
		
		bank.setAccounts(Arrays.asList(a1,a2));
		
		et.begin();
		em.persist(bank);
		em.persist(a1);
		em.persist(a2);
		et.commit();
		
		System.out.println("saved");
		
	}
}
