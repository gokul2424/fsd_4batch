package com.cts;

public class Person {

	public String name;
	public boolean drunk;
	public Person(String name, boolean drunk) {
		super();
		this.name = name;
		this.drunk = drunk;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", drunk=" + drunk + "]";
	}
	
	
	
}
