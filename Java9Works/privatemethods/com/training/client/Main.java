package com.training.client;

import com.training.interfaces.Car;
import com.training.model.BMW;
import com.training.model.Toyota;

public class Main {
	public static void main(String[] args) {
		
		Car car = new Toyota(); 
		
		System.out.println(car.noOfSeats()); 
		
		car.moveAhead(); 
		car.moveAhead(); 
		car.moveAhead(); 
		car.moveAhead(); 

		car.applyBreak(); 
		car.moveReverse(); 

		System.out.println("Gear Type " +  Car.getGearType());
		
		System.out.println("--------------------------------------------");
		
		car = new BMW(); 
		
		car.moveAhead(); 
		car.moveAhead(); 
		car.moveAhead(); 
		car.moveAhead(); 

		car.applyBreak(); 
		car.moveReverse(); 

		System.out.println("Gear Type " +  Car.getGearType());
		
	}
}
