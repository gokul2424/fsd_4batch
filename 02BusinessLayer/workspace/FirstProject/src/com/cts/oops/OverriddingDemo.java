package com.cts.oops;

public class OverriddingDemo {
	
	public static void main(String[] args){
		System.out.println("Overidding Demo...");
		Employee emp1 = new Employee(12, "Priya", 23433.34, 24);
		Manager manager1 = new Manager(23, "Ravi", 33433.34, 34,5);
		emp1.m1();
		manager1.m1();
		
		
		System.out.println(emp1.toString());
		System.out.println(manager1.toString());
	}

}
