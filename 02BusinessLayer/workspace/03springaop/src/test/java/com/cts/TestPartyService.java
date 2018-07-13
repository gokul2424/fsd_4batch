package com.cts;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class TestPartyService {
	
	@Autowired
	PartyService partyService;
	
	

	@Test
	public void testGuests() {
		
		Person person = new Person("Ravi", false);
		partyService.letsParty(person);
	}
	@Test(expected=RuntimeException.class)
	public void testGuestsUninvited() {
		
		Person person = new Person("Zane", false);
		partyService.letsParty(person);
	}
	
	
}
