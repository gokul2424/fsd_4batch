package com.cts;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cts.entity.Address;
import com.cts.entity.Item;
import com.cts.entity.Person;
import com.cts.repo.PersonRepo;

public class PersonTest {
	static PersonRepo personRepo;
	
	@BeforeClass
	public static void setup(){
		personRepo = new PersonRepo();
	}

//	@Test
	public void test() {
		Address address = new Address(12, "Belandur", "Bengaluru");
		Address address2 = new Address(122, "Jangpura", "New Delhi");
		List<Address> addresses = Arrays.asList(address, address2);
		Person person = new Person("Priya", 24, addresses);
		personRepo.savePerson(person);
	}
	
	@Test
	public void testFindPerson() {
	
		Person p = personRepo.findPerson(12); 
		System.out.println(p);
		System.out.println(p.getAddresses());
		assertEquals(p.getName(), "Priya");
	}
////	@Test
//	public void testFetchItem() {
//		
//		Item item = personRepo.fetchItem(5);
//		System.out.println(item);
//		assertEquals(item.getName() ,"Iphone");
//	}
//	
////	@Test
//	public void testUpdateItem() {	
//		Item item  =personRepo.updateItem(7);
//		System.out.println(item);
//		assertEquals(item.getName() ,"Ipad");
//	}
//	
////	@Test
//	public void testRemoveItem() {	
//		personRepo.removeItem(7);
////		System.out.println(item);
////		assertEquals(item.getName() ,"Ipad");
//	}
	
//	@Test
//	public void testItemByName() {	
//		List<Item> items = personRepo.fetchItemsByName("Iphone");
//		System.out.println(items);
//		assertEquals(items.size(), 2);
////		System.out.println(item);
////		assertEquals(item.getName() ,"Ipad");
//	}
}
