package com.cts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferService {
	
	@Autowired
	TransferRepository transferRepository;
	
//	public TransferService(TransferRepository transferRepository){
//		this.transferRepository = transferRepository;
//	}
	
	
	
	public boolean payment(int account1, int account2, double amount){
		// Load account 1
		
		System.out.println("Loading account 1");
		transferRepository.loadAccount(account1);
		
		// Load account 2
		System.out.println("Loading account 2");
		transferRepository.loadAccount(account2);
		
		// Make accounting entry
		// Make credit
		// Make debit
		
		return true;
		
	}

	public TransferRepository getTransferRepository() {
		return transferRepository;
	}

	public void setTransferRepository(TransferRepository transferRepository) {
		this.transferRepository = transferRepository;
	}

}
