package com.cts.colls;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetsDemo {

	public static void main(String[] args) {
		// Unorderd and unsorted
//		Set<String> fruits = new HashSet<>();
		
		// Ordered by insertion order
		Set<String> fruits = new LinkedHashSet<>();
		
		// Sorted
//		Set<String> fruits = new TreeSet<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("PineApple");
		fruits.add("Grapes");
		fruits.add("Banana");
		fruits.add("Orange");
		
		System.out.println(fruits);
		
		for(String fruit: fruits){
			System.out.println(fruit);
		}

	}

}
