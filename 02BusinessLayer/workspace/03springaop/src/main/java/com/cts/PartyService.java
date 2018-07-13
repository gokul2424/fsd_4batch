package com.cts;

import org.springframework.stereotype.Service;

@Service
public class PartyService {

	public void letsParty(Person person){
		
		
		
		if(person.drunk){
			throw new DrunkException("Guest is drunk.. so throwing him/her out!!");
		}
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("We are partying here");
		
	}
}
