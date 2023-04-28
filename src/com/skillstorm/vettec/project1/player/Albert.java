package com.skillstorm.vettec.project1.player;

public class Albert extends Player {
	public Albert() {
		super();
		Player.playerEnergy = 6;
		Player.playerPatience = 9;
		Player.playerIntelligence = 8;
	}

	public Albert(byte playerEnergy, byte playerIntelligence, byte playerPatience) {
		super();
		Albert.playerEnergy = playerEnergy;
		Albert.playerPatience = playerIntelligence;
		Albert.playerIntelligence = playerPatience;
	}

	@Override
	public String toString() {
		return "Albert is a kind older man, with only " + Albert.getPlayerEnergy()
				+ " energy. However, he makes up for it with his " + Albert.getPlayerIntelligence()
				+ " intelligence, and " + Albert.getPlayerPatience() + " patience.";
	}

}
