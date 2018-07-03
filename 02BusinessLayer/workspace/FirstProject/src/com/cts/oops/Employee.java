package com.cts.oops;

public class Employee {

	//Member fields
	int id;
	String name;
	Double salary;
	short age;
	
	//Constructor
	Employee(int id, String name, Double salary, int age){
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = (short) age;
	}
	
	//String representation of the object
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}


	// Member functions or methods
	public void incrementSalary(Double newSalary){
		if(newSalary>0){
			this.salary+= newSalary;		
		}
	}
	
	public void m1(){
		System.out.println("M1 in employee");
	}

	
}
