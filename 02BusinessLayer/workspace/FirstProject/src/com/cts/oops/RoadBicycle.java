package com.cts.oops;

public class RoadBicycle extends Bicycle {
	
	
	
	public RoadBicycle(int speed) {
		super(speed);
	}

//	
//	public void brakeDown(){
//		speed--;
//	}

	@Override
	public String toString() {
		return "RoadBicycle [speed=" + speed + "]";
	}

	@Override
	public void brakeDown() {
		speed--;
		
	}
	
	@Override
	public void changeGear(){
		System.out.println("Changing gears for Road Bicycle");
	}
	
	

}
