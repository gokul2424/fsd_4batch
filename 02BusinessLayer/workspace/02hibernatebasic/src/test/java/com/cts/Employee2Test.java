package com.cts;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cts.entity.inherit.ContractEmployee;
import com.cts.entity.inherit.Employee;
import com.cts.entity.inherit.RegularEmployee;
import com.cts.repo.EmployeeRepo;

public class Employee2Test {
	
	static EmployeeRepo employeeRepo;
	
	@BeforeClass
	public static void setup(){
		employeeRepo = new EmployeeRepo();
	}

//	@Test
	public void test() {
		Employee employee = new Employee("Ravi");
		employeeRepo.saveEmployee(employee);
	}
	@Test
	public void testRegularEmployee() {
		Employee employee = new RegularEmployee("Amit", 34433.33);
		employeeRepo.saveEmployee(employee);
	}
	
	@Test
	public void testContractEmployee() {
		Employee employee = new ContractEmployee("Priya", 34433.33);
		employeeRepo.saveEmployee(employee);
	}

}
