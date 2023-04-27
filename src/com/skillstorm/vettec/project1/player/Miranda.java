package com.skillstorm.vettec.project1.player;

public class Miranda extends Player{



	public Miranda(){
		super();
		Player.playerEnergy = 12;
		Player.playerPatience = 5;
		Player.playerIntelligence = 8;
	}


	
	public Miranda(byte playerEnergy, byte playerIntelligence, byte playerPatience) {
		super();
		Miranda.playerEnergy = playerEnergy;
		Miranda.playerPatience = playerIntelligence;
		Miranda.playerIntelligence = playerPatience;
	}

	
	@Override
	public String toString() {
		return "Miranda is and intelligent and energtic player with " + Miranda.getPlayerEnergy() + " energy and " + Miranda.getPlayerIntelligence() + " intelligence, however,"
				+ " she has a quick temper that can be set off if she loses her " + Miranda.getPlayerPatience() + " patience.";
	}

	
	
	
	
}
