package com.cts.entity.inherit;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class BankAccount {
	
	@Id
	BankDetails bankDetails;
	String accountName;
	Double balance;
	
	public BankAccount(){
		
	}
	public BankAccount(String accountName, Double balance) {
		super();
		this.accountName = accountName;
		this.balance = balance;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public BankDetails getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}
	
	
	

}
