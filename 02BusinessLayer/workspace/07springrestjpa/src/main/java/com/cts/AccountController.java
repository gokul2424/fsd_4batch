package com.cts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class AccountController {
	
	@Autowired
	AccountJPARepository accountRepository;
	
	@RequestMapping(method=RequestMethod.POST, path="/account")
	@ResponseBody
	public ResponseEntity<Void> addAccount(@RequestBody Account account){
		accountRepository.addAccount(account);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/account/{accountId}")
	public Account fetchAccount(@PathVariable("accountId") int accountId){
//		Account account = new Account(12, "Ravi", 34443.34);
		return accountRepository.loadAccount(accountId);
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/accounts")
	public List<Account> fetchAllAccount(){
//		Account account1 = new Account(12, "Ravi", 34443.34);
//		Account account2 = new Account(122, "Priya", 24443.34);
//		List<Account> accounts = new ArrayList<>();
//		accounts.add(account1); accounts.add(account2);
		
		return accountRepository.loadAllAccounts();
		 
	}
	
	

}
