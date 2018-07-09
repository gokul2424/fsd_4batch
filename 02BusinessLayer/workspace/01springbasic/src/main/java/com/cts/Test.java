package com.cts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
//		
//		A a = new A();
//		a.execute();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		A a = context.getBean(A.class);
		a.execute();

	}

}
