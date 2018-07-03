package com.cts.oops;

public class InhertitanceDemo {
	
//	Manager___ is a ___Employee
	
	public static void main(String[] args) {
		Manager manager1 = new Manager(23, "Ravi", 33433.34, 34,5);
		Manager manager2 = new Manager(233, "Priya", 34556.34, 34,5);
		System.out.println(manager1);
		manager1.incrementSalary(3000.00);
		System.out.println(manager1);
	}

}
