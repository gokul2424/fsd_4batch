package com.cts.aspects;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.cts.Person;

@Component
@Aspect
public class AroundPartyAspect {

	
	@Around("execution(void com.cts.PartyService.letsParty(..))")
	public void checkPartyGuests(ProceedingJoinPoint jp){
		Person guest = (Person)jp.getArgs()[0];
		//Before
		long startTime = System.currentTimeMillis();
		
			//Call target
			try {
				jp.proceed();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		//After
		long endTime = System.currentTimeMillis();
		System.out.println("Total time taken by guests: " + guest.name + " : " + (endTime-startTime));
	}
	

}
