package com.cts.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cts.entity.BankUser;



public class BankUserRepo {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("01hibernatebasic");

	

	public void addBankUser(BankUser user) {
		// Physical connection to perform db operations
//		Session session = sessionFactory.openSession();
		EntityManager em = emf.createEntityManager();

		// Manual transactions
//		Transaction tx = session.beginTransaction();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
//		session.save(user);
		em.persist(user);

		tx.commit();
		em.close();
		
	}


	public BankUser findBankUser(BankUser id) {
		// Physical connection to perform db operations
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		BankUser bankUser = em.find(BankUser.class, id);
		
		
		tx.commit();
		em.close();
		return bankUser;
			
		
	}

}
