package com.cts.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

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
	
	public void removeItem(int id){
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Item item = em.find(Item.class, id);
		em.remove(item);
		tx.commit();
		em.close();
	}
	
	public Item updateItem(int id){
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Item item = em.find(Item.class, id);
		
		tx.commit();
		em.close();
		return item;
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
	
	public List<Item> fetchItemsByName(String name){
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		TypedQuery<Item> query = em.createNamedQuery("findByItemName", Item.class);
//		Query query = em.createQuery("select it from Item it where it.name = :itemname");
		query.setParameter("itemname", name);
		List<Item> items  = query.getResultList();
		tx.commit();
		em.close();
		return items;
	}

}
