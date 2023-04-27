package com.skillstorm.vettec.project1.player;

public class Jackie extends Player{
	public Jackie(){
		super();
		Player.playerEnergy = 10;
		Player.playerPatience = 7;
		Player.playerIntelligence = 4;
	}


	
	public Jackie(byte playerEnergy, byte playerIntelligence, byte playerPatience) {
		super();
		Jackie.playerEnergy = playerEnergy;
		Jackie.playerPatience = playerIntelligence;
		Jackie.playerIntelligence = playerPatience;
	}
		
	
	@Override
	public String toString() {
		return "Jackie isn't too bright with " + Jackie.getPlayerIntelligence() + " intelligence. However, she has a lot of energy at " + Jackie.getPlayerEnergy() +
				" energy, and a decent amount of " + Jackie.getPlayerPatience() + " patience.";
	}
}
