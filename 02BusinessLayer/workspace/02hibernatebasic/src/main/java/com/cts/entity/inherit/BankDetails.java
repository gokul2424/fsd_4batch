package com.cts.entity.inherit;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Embeddable
public class BankDetails {
	
//	@GeneratedValue(strategy=GenerationType.AUTO)
	int bankId;
	
//	@GeneratedValue(strategy=GenerationType.AUTO)
	int accountId;
	public BankDetails(){
		
	}
	

	public BankDetails(int bankId, int accountId) {
	super();
	this.bankId = bankId;
	this.accountId = accountId;
}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountId;
		result = prime * result + bankId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankDetails other = (BankDetails) obj;
		if (accountId != other.accountId)
			return false;
		if (bankId != other.bankId)
			return false;
		return true;
	}
	
	

}
