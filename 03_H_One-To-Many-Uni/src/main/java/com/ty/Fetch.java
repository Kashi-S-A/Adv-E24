package com.ty;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Bank bank = em.find(Bank.class, 102);
		
		if (bank!=null) {
			System.out.println(bank);
			
			List<Account> accounts = bank.getAccounts();
			for (Account account : accounts) {
				System.out.println(account);
				System.out.println("===============");
			}
		} else {
			System.out.println("not found");
		}
	}
}
