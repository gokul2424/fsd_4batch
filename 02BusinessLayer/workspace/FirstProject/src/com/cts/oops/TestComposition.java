package com.cts.oops;

public class TestComposition {

	public static void main(String[] args) {
		Address address = new Address(2334, "Marathalli", "Bangalore");
		Employee emp1 = new Employee(12, "Ravi", 34433.34, 34, address);
		Employee emp2 = new Employee(123, "Priya", 54433.34, 34, address);
		System.out.println(address);
		System.out.println(emp1);
		System.out.println(emp2);

	}

}
