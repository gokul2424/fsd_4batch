package com.cts.oops;

public class TestInterfaces {
	
	public static void main(String[] args) {
		
//		Bicycle b = new Bicycle(23);
		
		
		MountainBicycle mb = new MountainBicycle(10);
		mb.brakeDown();
		System.out.println(mb);
		
		RoadBicycle rb = new RoadBicycle(10);
		rb.brakeDown();
		System.out.println(rb);
	}

}
