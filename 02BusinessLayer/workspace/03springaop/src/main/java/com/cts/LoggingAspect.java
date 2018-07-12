package com.cts;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	
	@Before("execution(String com.cts.*Service.*(..))")
	public void doLogging(JoinPoint jp){
		Object args[] = jp.getArgs();
		for(Object arg: args){
			System.out.println(arg);
		}
		System.out.println("Logging Aspect ***");
	}
	@AfterReturning(value="execution(String com.cts.*Service.*(..))", returning = "result")
	public void doPostLogging(JoinPoint jp, Object result){
		
		System.out.println("Log the response from methods..");
		System.out.println(result);
	}

}
