package com.training.genericsusingcollections;

import java.util.Arrays;

public class Main{
	
	public static void main(String[] args) {
		PlayGround<SportsTrainee> players = new PlayGround<SportsTrainee>(Arrays.asList(
				new BadmintonTrainee(101, "Kanchan"), 
				new CricketTrainee(102, "Chiru"), 
				new CricketTrainee(103, "Rama"), 
				new BadmintonTrainee(104, "Krishna"), 
				new CricketTrainee(345, "Tony")
				
			));
		
		players.play();
		
	}
}
