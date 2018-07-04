package com.cts.colls;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.cts.Employee;

public class CollectionsDemo {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(23, "Ravi", 33433.34, 34);
		Employee emp2 = new Employee(13, "Priya", 323433.34, 34);
		Employee emp3 = new Employee(233, "Chitvan", 33443.34, 45);
		Employee emp4 = new Employee(233, "Chitvan", 22443.34, 45);
		
//		Arrays are fixed size, we cannot dynamically increase size
//		Employee employees[] = new Employee[3];
//		employees[0] = emp1;
//		employees[1]= emp2;
//		employees[2] = emp3;
//		employees[3] = emp4;
		
		// Lists, dynamic sizes
		List<Employee> employees = new LinkedList<>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		
		
		employees.add(1, emp4);
		
		System.out.println(employees.get(0));
		
		for(Employee e : employees){
			System.out.println(e);
		}
		
		System.out.println(employees);
		System.out.println("Size: "+ employees.size());
		
	}

}
