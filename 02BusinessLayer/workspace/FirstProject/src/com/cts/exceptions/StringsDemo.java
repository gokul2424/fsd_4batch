package com.cts.exceptions;

import com.cts.oops.Address;
import com.cts.oops.Employee;

public class StringsDemo {

	public static void main(String[] args) {
		int i = 0;
		// Internalize
		String str1 = "Ravi";
		String str2 = "Ravi";
		
		String newStr = str1.substring(1, 3);
		System.out.println(newStr);
		System.out.println(str1);
		
		Address address = new Address(2334, "Marathalli", "Bangalore");
		Employee emp1 = new Employee(12, "Ravi", 34433.34, 34, address);
		Employee emp2 = new Employee(12, "Ravi", 54433.34, 34, address);
		System.out.println(emp1.equals(emp2));
		System.out.println(str1.equals(str2));
		
		System.out.println(emp1 == emp2);
		emp1.incrementSalary(23.00);
		System.out.println(str1 == str2);
	}
}
