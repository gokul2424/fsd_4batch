package com.cts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTransferService {

	public static void main(String[] args) {
//		
//		A a = new A();
//		a.execute();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		TransferService service= context.getBean(TransferService.class);
		service.payment(1234556666, 1234557777, 233333.34);

	}

}
