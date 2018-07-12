package com.cts;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	public String registerUser(String email, String password, String confirmPassword){
		// Logging code 
//		System.out.println(email);
//		System.out.println(password);
//		System.out.println(confirmPassword);
//		
		// Business logic code.
		// Calling the Repository etc.
		
		if(!password.equals(confirmPassword)){
			throw new RuntimeException("Passwords don't Match");
		}
		
		return "SUCCESS-US";
		
		
	}

}
