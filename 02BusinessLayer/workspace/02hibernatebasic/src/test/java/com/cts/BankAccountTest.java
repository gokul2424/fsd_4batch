package com.cts;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cts.entity.inherit.BankAccount;
import com.cts.entity.inherit.BankDetails;
import com.cts.entity.inherit.ContractEmployee;
import com.cts.entity.inherit.Employee;
import com.cts.entity.inherit.RegularEmployee;
import com.cts.repo.BankAccountRepo;
import com.cts.repo.EmployeeRepo;

public class BankAccountTest {
	
	static BankAccountRepo bankAccountRepo;
	
	@BeforeClass
	public static void setup(){
		bankAccountRepo = new BankAccountRepo();
	}

	@Test
	public void test() {
		BankAccount bankAccount = new BankAccount("Priya", 343443.34);
		BankDetails bd = new BankDetails(1,2);
		bankAccount.setBankDetails(bd);
		bankAccountRepo.saveBankAccount(bankAccount);
	}
	
}
