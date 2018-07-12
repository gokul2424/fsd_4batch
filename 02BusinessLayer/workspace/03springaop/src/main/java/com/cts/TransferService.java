package com.cts;

import org.springframework.stereotype.Service;

@Service
public class TransferService {
	
	public String moneyTransfer(int account1, int account2, double amount){
		// Logging code 
//		System.out.println(account1);
//		System.out.println(account2);
//		System.out.println(amount);
		
		// Business logic code.
		// Calling the Repository etc.
		
		return "SUCCESS-TS";
	}

}
