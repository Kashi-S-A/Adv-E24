package com.ty;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FetchByAccount {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Account account = em.find(Account.class, 333);
		
		if (account!=null) {
			System.out.println(account);
			Bank bank = account.getBank();
			System.out.println(bank);
		} else {
			System.out.println("Not found");
		}
	}
}
