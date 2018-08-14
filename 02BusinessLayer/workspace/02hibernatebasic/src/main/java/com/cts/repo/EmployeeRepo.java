package com.cts.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cts.entity.inherit.Employee;

public class EmployeeRepo {
	
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("01hibernatebasic");
	public void saveEmployee(Employee employee){
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(employee);
		tx.commit();
		em.close();
	}
	

}
