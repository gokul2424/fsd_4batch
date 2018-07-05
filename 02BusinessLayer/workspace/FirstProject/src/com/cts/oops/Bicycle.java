package com.cts.oops;

public abstract class Bicycle implements IBicycle {

	int speed;
	
	public Bicycle(int speed) {
		super();
		this.speed = speed;
	}
	
	public abstract void brakeDown();
	
	
	
	public void speedUp(){
		speed++;
	}
}
