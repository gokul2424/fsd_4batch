package com.cts;

public class Employee {

	//Member fields
	int id;
	String name;
	Double salary;
	short age;
	
	//Constructor
	Employee(int id, String name, Double salary, short age){
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	
	//String representation of the object
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}


	// Member functions
	public void incrementSalary(Double newSalary){
		if(newSalary>0){
			this.salary+= newSalary;		
		}
	}

	
}
