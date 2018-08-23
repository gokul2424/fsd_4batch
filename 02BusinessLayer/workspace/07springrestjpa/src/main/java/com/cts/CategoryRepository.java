package com.cts;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
@Repository
public class CategoryRepository {
	
	@PersistenceContext
	EntityManager em;
	
	
	
	@Transactional
	public Category findCategory(int id){
		return em.find(Category.class, id);
	}
	
//	@Transactional
//	public List<Account> loadAllAccounts(){
//		Query query = em.createNamedQuery("findAllAccounts");
//		List<Account> accounts = query.getResultList();
//		return accounts;
//	}
	@Transactional
	public void addCategory(Category category) {
		em.persist(category);		
	}
	@Transactional
	public void deleteCategory(int categoryId) {
		Category category = em.find(Category.class, categoryId);
		em.remove(category);
	}

}
