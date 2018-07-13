package com.cts.aspects;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.cts.DrunkException;
import com.cts.Person;

@Component
@Aspect
public class AfterThrowingPartyAspect {
	
	
	
	@AfterThrowing(value="execution(void com.cts.PartyService.letsParty(..))", throwing="e")
	public void checkPartyGuests(JoinPoint jp, DrunkException e){
		System.out.println("Catch the exception here...");
		System.out.println("Arrange a cab to go home!!");
		e.printStackTrace();
		
	}
	

}
