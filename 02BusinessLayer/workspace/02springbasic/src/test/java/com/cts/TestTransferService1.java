package com.cts;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class TestTransferService1 {
	
	@Autowired
	TransferService service;

	@Test
	public void test() {
		boolean result = service.payment(1234556666, 1234557777, 233333.34);
		assertTrue(result);
	}
	
	@Test
	public void testAnotherAccount() {
		boolean result = service.payment(4321, 9876, 333.33);
		assertTrue(result);
	}

}
