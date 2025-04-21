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
		bank.setBid(102);
		bank.setName("ICICI");
		bank.setAddress("BLR");
		
		Account a1 = new Account();
		a1.setAccno(333);
		a1.setName("John");
		a1.setBalance(15000);
		a1.setBank(bank);
		
		Account a2 = new Account();
		a2.setAccno(444);
		a2.setName("Max");
		a2.setBalance(25000);
		a2.setBank(bank);
		
		bank.setAccounts(Arrays.asList(a1,a2));
		
		et.begin();
		em.persist(bank);
		em.persist(a1);
		em.persist(a2);
		et.commit();
		
		System.out.println("saved");
		
	}
}
