package com.training.genericsusingcollections;

public class CricketTrainee extends SportsTrainee{
	public CricketTrainee(int traineeId, String traineeName) {
		super(traineeId, traineeName);
	}

	public void bats(int runs) {
		System.out.println(this.traineeName +" get " + runs);
	}
	
	public void bowls() {
		System.out.println(this.traineeName +" bowls");
	}
	
	public void fields() {
		System.out.println(this.traineeName +", fields");
	}
	
}
