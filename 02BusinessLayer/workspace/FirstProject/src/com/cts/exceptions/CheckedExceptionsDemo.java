package com.cts.exceptions;


class CourseNotFoundException extends Exception{
	public CourseNotFoundException(String message){
		super(message);
	}
}

class CourseAlreadyExistsException extends RuntimeException{
	public CourseAlreadyExistsException(String message){
		super(message);
	}
}



public class CheckedExceptionsDemo {
	
	
	public static void m2(int divisor) throws CourseAlreadyExistsException{
		System.out.println("M2");
		if(divisor == 0){
			//Throw is to explicitly throw exceptions
			throw new CourseAlreadyExistsException("This already exists!!");
		}
	}
	
	//Throws is just an warning to the caller that the method is error prone and you must add handling
	public static void m1() throws CourseAlreadyExistsException{
		System.out.println("M1");
		m2(0);
	}

	public static void main(String[] args)  {
		// Try is you guarded region, put any code that's prone to errors inside try block
		
		try{
			m1();
		}
		catch(CourseAlreadyExistsException e){
			e.printStackTrace();
		}
		System.out.println("All well that ends well!!");
	}

}
