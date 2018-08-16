package com.cts.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cts.entity.inherit.BankAccount;

public class BankAccountRepo {
	
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("01hibernatebasic");
	public void saveBankAccount(BankAccount bankAccount){
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(bankAccount);
		tx.commit();
		em.close();
	}
	

}
