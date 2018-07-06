package com.cts.colls;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import com.cts.oops.Address;
import com.cts.oops.Employee;

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
		
		Set<Employee> employees = new HashSet<>();
		Address address = new Address(2334, "Marathalli", "Bangalore");
		Employee emp1 = new Employee(12, "Ravi", 34433.34, 34, address);
		Employee emp2 = new Employee(123, "Priya", 54433.34, 34, address);
		Employee emp3 = new Employee(12, "Ravi", 34433.34, 34, address);
		Employee emp4 = new Employee(1235, "Sonia", 54433.34, 34, address);
		
		employees.add(emp1);
		employees.add(emp2);
//		employees.add(emp3);
		employees.add(emp4);
		
		System.out.println(employees);
		boolean result = employees.contains(emp3);
		System.out.println(result);
		

	}

}
