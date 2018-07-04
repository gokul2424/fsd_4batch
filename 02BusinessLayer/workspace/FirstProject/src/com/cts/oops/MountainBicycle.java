package com.cts.oops;

public class MountainBicycle extends Bicycle {
	
	
	public MountainBicycle(int speed) {
		super(speed);
	}

	public void brakeDown(){
		this.speed = this.speed-2;
	}

	@Override
	public String toString() {
		return "MountainBicycle [speed=" + speed + "]";
	}
	
	

}
