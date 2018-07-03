package com.cts;

public class ArrayDemo {

	
	public static void main(String[] args) {
//		int student1score = 34;
//		int student2score = 35;
//		int student3score = 36;
//		int student4score = 37;
//		int student5score = 38;
//		int student6score = 39;
		
		int scores[] = {34,35,36,37,38,39};
		
//		System.out.println(scores[7]);
//		System.out.println(scores.length);
//		
		
//		For loop using indexes
//		for(int i=0;i<=scores.length; i++){
//			System.out.println(scores[i]);
//		}
		
		//Enhanced for loop
		for(int score: scores){
			System.out.println(score);
		}
		
		
	}
}
