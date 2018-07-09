package com.cts.colls;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.cts.oops.Address;
import com.cts.oops.Employee;

public class MapsDemo {

	public static void main(String[] args) {
		Map<Integer, Employee> employeeMap = new LinkedHashMap<>();
		
		Address address = new Address(2334, "Marathalli", "Bangalore");
		Employee emp1 = new Employee(12, "Ravi", 34433.34, 34, address);
		Employee emp2 = new Employee(123, "Priya", 54433.34, 34, address);
		
		employeeMap.put(12, emp1);
		employeeMap.put(123, emp2);
		
		System.out.println(employeeMap);
		
		System.out.println(employeeMap.get(12));
		
		
		Set<Integer> ids = employeeMap.keySet();
		for(Integer id: ids){
			System.out.println(id);
			System.out.println(employeeMap.get(id));
		}
		
		
		Set<Entry<Integer, Employee>>entries = employeeMap.entrySet();
		
		for(Entry<Integer,Employee> entry: entries){
			System.out.println(entry);
		}
	}
}
