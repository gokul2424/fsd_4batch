package com.cts.exceptions;

public class ExceptionsDemo {
	
	
	public static void m2(int divisor) throws Exception{
		System.out.println("M2");
		if(divisor == 0){
			//Throw is to explicitly throw exceptions
			throw new Exception("Division by Zero");
		}
	}
	
	//Throws is just an warning to the caller that the method is error prone and you must add handling
	public static void m1() throws Exception{
		System.out.println("M1");
		m2(0);
	}

	public static void main(String[] args)  {
		// Try is you guarded region, put any code that's prone to errors inside try block
		try {
			m1();
		} catch (Exception e) {
			// Catch is the handling block, put handling code here and might differ case to case basis
			e.printStackTrace();
		}
		System.out.println("All well that ends well!!");
	}

}
