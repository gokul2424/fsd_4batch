package com.cts;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
@Repository
public class AccountJPARepository {
	
	@PersistenceContext
	EntityManager em;
	
	
	
	@Transactional
	public Account loadAccount(int accountNumber){
		return em.find(Account.class, accountNumber);
	}
	
	@Transactional
	public List<Account> loadAllAccounts(){
		Query query = em.createNamedQuery("findAllAccounts");
		List<Account> accounts = query.getResultList();
		return accounts;
	}
	@Transactional
	public void addAccount(Account account) {
		em.persist(account);		
	}

}
