package com.cts;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cts.entity.Item;
import com.cts.repo.ItemRepo;

public class ItemTest {
	
	ItemRepo itemRepo;
	
	@BeforeClass
	public void setup(){
		itemRepo = new ItemRepo();
	}

	@Test
	public void test() {
		Item item = new Item("Iphone", 34565.3);
		itemRepo.saveItem(item);
	}

}
