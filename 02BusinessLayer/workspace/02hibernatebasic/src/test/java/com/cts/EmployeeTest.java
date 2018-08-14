package com.cts;

import org.junit.BeforeClass;

import com.cts.entity.inherit.ContractEmployee;
import com.cts.entity.inherit.Employee;
import com.cts.entity.inherit.RegularEmployee;
import com.cts.repo.EmployeeRepo;

public class EmployeeTest {
	static EmployeeRepo employeeRepo;
	
	@BeforeClass
	public static void setup(){
		employeeRepo = new EmployeeRepo();
	}

//	@Test
	public void test() {
		Employee emp = new Employee("Ravi");
		employeeRepo.saveEmployee(emp);
	}
	
//	@Test
	public void testRegularEmployee() {
		RegularEmployee emp = new RegularEmployee("Priya", 34343.33);
		employeeRepo.saveEmployee(emp);
	}
	

	public void testContractualEmployee() {
		ContractEmployee emp = new ContractEmployee("Arun", 34343.33);
		employeeRepo.saveEmployee(emp);
	}
	
}
