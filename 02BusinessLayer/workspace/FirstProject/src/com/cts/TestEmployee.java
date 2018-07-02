package com.cts;

public class TestEmployee {

	public static void main(String[] args) {
		short age = 190;
		Employee emp1 = new Employee(23, "Ravi", 33433.34, age);
		System.out.println(emp1);
//		emp1.incrementSalary(34444.44);
		
		boolean flag = true;
		while(flag){
			emp1.incrementSalary(1000.00);
			System.out.println(emp1);
			if(emp1.salary>35000){
//				break;
				flag = false;
			}
			
		}
		
		
	}
}
