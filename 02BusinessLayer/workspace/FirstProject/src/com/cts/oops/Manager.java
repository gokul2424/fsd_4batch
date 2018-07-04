package com.cts.oops;

public class Manager extends Employee{
	//Field specific to Manager
	int numberOfEmployeesUnder;

	//Constructor for manager
	Manager(int id, String name, Double salary, int age, int numberOfEmployeesUnder) {
		super(id, name, salary, age, null);
		this.numberOfEmployeesUnder = numberOfEmployeesUnder;
	}

	@Override
	public String toString() {
		return "Manager [numberOfEmployeesUnder=" + numberOfEmployeesUnder + ", id=" + id + ", name=" + name
				+ ", salary=" + salary + ", age=" + age + "]";
	}
	
	@Override
	public void m1(){
		System.out.println("M1 in manager");
	}

}
