package com.cts.entity.inherit;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="3")
public class ContractEmployee extends Employee {

	double payPerMonth;
	public ContractEmployee(){
		
	}
	
	public ContractEmployee(String name, double salary) {
		super(name);
		this.payPerMonth = salary;
	}
	public double getSalary() {
		return payPerMonth;
	}

	public void setSalary(double salary) {
		this.payPerMonth = salary;
	}
	@Override
	public String toString() {
		return "RegularEmployee [salary=" + payPerMonth + ", id=" + id + ", name=" + name + "]";
	}
	
	

}
