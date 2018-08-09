package com.cts;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cts.entity.Item;
import com.cts.repo.ItemRepo;

public class ItemTest1 {
	static ItemRepo itemRepo;
	
	@BeforeClass
	public static void setup(){
		itemRepo = new ItemRepo();
	}

//	@Test
	public void test() {
		Item item = new Item("Iphone", 34565.3);
		itemRepo.saveItem(item);
	}
	@Test
	public void testFetchItem() {
		
		Item item = itemRepo.fetchItem(5);
		System.out.println(item);
		assertEquals(item.getName() ,"Iphone");
	}
}
