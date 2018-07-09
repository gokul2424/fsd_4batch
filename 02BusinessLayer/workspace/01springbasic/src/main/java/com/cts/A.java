package com.cts;

public class A {
	
	B b;
	C c;
	
	public A(){}
	
	public A(B b, C c){
		this.b = b;
		this.c = c;
//		b = new B();
//		c = new C();
	}
	
	
	public void execute(){
		System.out.println("Execute method in class A");
		b.execute();
		c.execute();
	}

}
