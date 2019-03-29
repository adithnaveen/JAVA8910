package com.training.genericsusingcollections;

import java.util.List;

public class PlayGround<T extends SportsTrainee>{
	List<T> players; 
	
	public PlayGround(List<T> players) {
		this.players = players; 
	}
	
	public void play() {
		for(T player : players) {
			player.getTraineeDetails();

			if(player instanceof BadmintonTrainee) {
				((BadmintonTrainee) player).smash(); 
				((BadmintonTrainee) player).defends();
				
			}else if(player instanceof CricketTrainee) {
				int randomNumber = (int) (Math.random() *6); 
				((CricketTrainee) player).bats(randomNumber);
				((CricketTrainee) player).bowls();
				((CricketTrainee) player).fields();
			}
			System.out.println("---------------------------------------");
		}
		
	}
}
