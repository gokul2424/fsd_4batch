package com.cts.oops;

public class Address {
	
	int houseNumber;
	String location;
	String city;
	
	// Initialize fields
	public Address(int houseNumber, String location, String city) {
		super();
		this.houseNumber = houseNumber;
		this.location = location;
		this.city = city;
	}
	// Give a string representation to the object
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", location=" + location + ", city=" + city + "]";
	}
	
	
	

}
