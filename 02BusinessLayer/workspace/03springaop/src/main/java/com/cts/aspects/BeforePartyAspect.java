package com.cts.aspects;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.cts.Person;

@Component
@Aspect
public class BeforePartyAspect {
	
	static Map<String, Person> invitedGuests = new HashMap<>();
	static {
		invitedGuests.put("Ravi", new Person("Ravi", false));
		invitedGuests.put("Priya", new Person("Priya", true));
		invitedGuests.put("Sonia", new Person("Sonia", false));
	}
	
	
	@Before("execution(void com.cts.PartyService.letsParty(..))")
	public void checkPartyGuests(JoinPoint jp){
		Object args[] = jp.getArgs();
		Person person = (Person) args[0];
		
		System.out.println("Printing the guests list...");
		System.out.println(person);
		if(invitedGuests.get(person.name)==null){
			throw new RuntimeException("Uninvited Guests");
		}
	}
	

}
