package com.training.interfaces;

/**
 * 
 * @author Naveen
 * @see The interface shall have methods which are overridden by the implementing 
 *      classes, and private method 
 */
public interface Car {
	static String DEFAULT_GEAR="MANUAL"; 
	
	public String noOfSeats(); 
	public void moveAhead(); 
	public void applyBreak(); 
	public void moveReverse(); 
	
	default String triggerSpeed() {
		return drivingSpeed() + ", you are over speeding <ALERT> <ALERT>";
	}
	
	default String overSpeedFine() {
		return drivingSpeed() +", you crossed it and fined"; 
	}
	
	default void safety() {
		System.out.println("While driving wearning seat belt is mandatory");
	}

	private String drivingSpeed() {
		return "Max Driving Speed is 80 KMPH from Company"; 
	}

	// this method cannot be overridden 
	static String getGearType() {
		return DEFAULT_GEAR; 
	}
	
	
}











