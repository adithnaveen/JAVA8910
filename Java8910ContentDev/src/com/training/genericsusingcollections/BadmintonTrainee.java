package com.training.genericsusingcollections;

public class BadmintonTrainee extends SportsTrainee {
	
	public BadmintonTrainee(int traineeId, String traineeName) {
		super(traineeId, traineeName);
	}

	public void smash() {
		System.out.println(this.traineeName +" Smashes ");
	}
	
	public void defends() {
		System.out.println(this.traineeName +" Defends");
	}
	
}