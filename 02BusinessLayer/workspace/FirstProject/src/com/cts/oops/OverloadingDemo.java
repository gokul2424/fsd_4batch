package com.cts.oops;

public class OverloadingDemo {
	
	
	public int add(int x, int y){
		return x+y;
	}
	
	public int add(int x, int y, int z){
		return x+y+z;
	}
	
	//Varible arguments
	public int add(int ...values){
		int sum = 0;
		for(int value: values){
			sum+=value;
		}
		return sum;
	}
	
//	public int add(int values[]){
//		int sum = 0;
//		for(int value: values){
//			sum+=value;
//		}
//		return sum;
//	}
	
	public static void main(String[] args) {
		OverloadingDemo od = new OverloadingDemo();
		int result = od.add(4, 5);
		System.out.println(result);
		
		int result1 = od.add(4, 5, 6);
		System.out.println(result1);
		
//		int arr[] = {4, 5, 6, 5 ,3 ,4};
		int result2 = od.add(4, 5, 6, 5 ,3 ,4);
		System.out.println(result2);
	}

}
