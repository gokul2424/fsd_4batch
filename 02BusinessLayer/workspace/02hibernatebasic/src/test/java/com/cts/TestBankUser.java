package com.cts;


import org.junit.BeforeClass;
import org.junit.Test;

import com.cts.entity.BankUser;
import com.cts.entity.BankUserDetails;
import com.cts.entity.CompositeKey;
import com.cts.repo.BankUserRepo;


public class TestBankUser {

	private BankUserRepo repo = new BankUserRepo();

	@BeforeClass
	public static void setUp() {
		// repo.
	}

//	 @Test
	public void addEmployee() {

		BankUser bankUser = new BankUser();
		bankUser.setUsername("Sandeep");
		bankUser.setBalance(34353.33);

		repo.addBankUser(bankUser);
	}

	
	@Test
	public void addBankUserWithDetails() {

		CompositeKey keys = new CompositeKey();
		keys.setBankId(104);
		keys.setUserId(125);
		
		BankUser bankUser = new BankUser();
		bankUser.setId(keys);
		bankUser.setUsername("Priya");
		bankUser.setBalance(34353.33);
		
		BankUserDetails details = new BankUserDetails();
		details.setAge(34);
		bankUser.setBankUserDetails(details);

		repo.addBankUser(bankUser);
	}

	

//	@Test
	public void findEmployee() {
		BankUser user = new BankUser();
//		user.setBankId(11);
//		user.setUserId(10);
		BankUser bankUser = repo.findBankUser(user);
		System.out.println(bankUser);
	}

}

