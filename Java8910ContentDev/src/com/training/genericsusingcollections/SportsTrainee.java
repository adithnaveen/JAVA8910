package com.training.genericsusingcollections;

public class SportsTrainee {
	protected int traineeId; 
	protected String traineeName; 
	
	public SportsTrainee(int traineeId, String traineeName) {
		this.traineeId = traineeId;
		this.traineeName = traineeName;
	}
	
	public void getTraineeDetails() {
		System.out.println("Trainee Id " + this.traineeId +", Trainee Name : "
				+ this.traineeName);
	}
}



