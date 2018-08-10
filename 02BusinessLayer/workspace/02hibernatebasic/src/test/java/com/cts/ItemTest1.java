package com.cts;

import static org.junit.Assert.assertEquals;

import java.util.List;

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
//	@Test
	public void testFetchItem() {
		
		Item item = itemRepo.fetchItem(5);
		System.out.println(item);
		assertEquals(item.getName() ,"Iphone");
	}
	
//	@Test
	public void testUpdateItem() {	
		Item item  =itemRepo.updateItem(7);
		System.out.println(item);
		assertEquals(item.getName() ,"Ipad");
	}
	
//	@Test
	public void testRemoveItem() {	
		itemRepo.removeItem(7);
//		System.out.println(item);
//		assertEquals(item.getName() ,"Ipad");
	}
	
	@Test
	public void testItemByName() {	
		List<Item> items = itemRepo.fetchItemsByName("Iphone");
		System.out.println(items);
		assertEquals(items.size(), 2);
//		System.out.println(item);
//		assertEquals(item.getName() ,"Ipad");
	}
}
