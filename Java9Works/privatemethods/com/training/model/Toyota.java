package com.training.model;

import com.training.interfaces.Car;

public class Toyota  implements Car{

	int speed; 
	
	@Override
	public String noOfSeats() {
		return "Toyota has 4 + 1, number of seats";
	}

	@Override
	public void moveAhead() {
		speed += 20; 
		System.out.println( this.getClass().getSimpleName() +" moving ahead with speed " + speed);

		if(speed >=80) {
			System.out.println(this.triggerSpeed());
			System.out.println(this.overSpeedFine());
		}
	}

	
	@Override
	public void applyBreak() {
		speed -=20;
		System.out.println("Toyota applied break, and speed at : " + speed);
	
		if(speed <=0) {
			System.out.println("Car is halted..");
		}
		
	}

	@Override
	public void moveReverse() {
		System.out.println("Toyota moving reerse");
	}

}
