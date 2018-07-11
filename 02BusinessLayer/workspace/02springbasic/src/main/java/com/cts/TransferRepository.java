package com.cts;

import org.springframework.stereotype.Repository;

@Repository
public class TransferRepository {
	
	public void loadAccount(int accountNumber){
		System.out.println("Loaded account : "+ accountNumber);
		
	}

}
