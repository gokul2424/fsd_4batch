package com.cts.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cts.entity.Item;

public class ItemRepo {
	
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("01hibernatebasic");
	public void saveItem(Item item){
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(item);
		tx.commit();
		em.close();
	}
	
	public Item fetchItem(int id){
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Item item = em.find(Item.class, id);
		tx.commit();
		em.close();
		return item;
	}

}
