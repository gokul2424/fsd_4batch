package com.cts;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
	@RequestMapping(method=RequestMethod.GET, path="/account")
	public Account fetchAccount(){
		Account account = new Account(12, "Ravi", 34443.34);
		return account;
	}

}
