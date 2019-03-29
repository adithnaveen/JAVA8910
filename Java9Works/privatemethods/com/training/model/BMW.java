package com.training.model;

import com.training.interfaces.Car;

public class BMW implements Car{

	private int speed; 
	
	@Override
	public String noOfSeats() {
		return "BMW Has 6 + 1 seats"; 
	}

	@Override
	public void moveAhead() {
		speed += 25; 
		System.out.println( this.getClass().getSimpleName() +" moving ahead with speed " + speed);
		
		if(speed>=80) {
			System.out.println(this.triggerSpeed());
			System.out.println(this.overSpeedFine());
		}
	}

	@Override
	public void applyBreak() {
		speed -=20; 
		System.out.println("BMW applied break and speed at " + speed);
		
		if(speed <=0) {
			System.out.println("Car is halted...");
		}
	}

	@Override
	public void moveReverse() {
		System.out.println("BMW moving reverse");
	}
}