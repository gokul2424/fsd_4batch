package com.cts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class AccountController {
	
	@Autowired
	AccountRepository accountRepository;
	
	@RequestMapping(method=RequestMethod.GET, path="/account/{accountId}")
	public Account fetchAccount(@PathVariable("accountId") int accountId){
//		Account account = new Account(12, "Ravi", 34443.34);
		return accountRepository.loadAccount(accountId);
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/accounts")
	public List<Account> fetchAllAccount(){
		Account account1 = new Account(12, "Ravi", 34443.34);
		Account account2 = new Account(122, "Priya", 24443.34);
		List<Account> accounts = new ArrayList<>();
		accounts.add(account1); accounts.add(account2);
		return accounts;
	}

}
