package com.cts;

public class TestEmployees {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(23, "Ravi", 33433.34, 34);
		Employee emp2 = new Employee(13, "Priya", 323433.34, 34);
		Employee emp3 = new Employee(233, "Chitvan", 33443.34, 45);
		
		
//		int scores[] = {34,35,36,37,38,39};
//		Employee employees[] = {emp1, emp2, emp3};
		
		Employee employees[] = new Employee[4];
		employees[0] = emp1;
		employees[1]= emp2;
		employees[2] = emp3;
		
		
		//Enhanced for loop
		for(Employee emp: employees){
			System.out.println(emp);
			emp.incrementSalary(5000.00);
			System.out.println("------- After increment -------");
			System.out.println(emp);
		}
		
		
	}

}
