package com.skillstorm.vettec.project1.player;


public class Player {
	protected static byte playerEnergy; // static variables so they can be changed based on player and scenario
	protected static byte playerPatience; // each have getters and setters in order to access them below
	protected static byte playerIntelligence; // and keep them protected 
	
	public Player() { // default constructor
		Player.playerEnergy = 0;
		Player.playerPatience = 0;
		Player.playerIntelligence = 0;
	}
	
	public Player(byte playerEnergy, byte playerPatience, byte playerIntelligence) { // constructor
		Player.playerEnergy = playerEnergy;
		Player.playerPatience = playerPatience;
		Player.playerIntelligence = playerIntelligence;
		
	}

	public static byte getPlayerEnergy() {
		return playerEnergy;
	}

	public static void setPlayerEnergy(byte playerEnergy) {
		Player.playerEnergy = playerEnergy;
	}

	public static byte getPlayerPatience() {
		return playerPatience;
	}

	public static void setPlayerPatience(byte playerPatience) {
		Player.playerPatience = playerPatience;
	}

	public static byte getPlayerIntelligence() {
		return playerIntelligence;
	}

	public static void setPlayerIntelligence(byte playerIntelligence) {
		Player.playerIntelligence = playerIntelligence;
	}
	
	@Override // default string for beginning to give user information on players
	public String toString() {
		return "Players Miranda, Albert, and Jackie have different energy, intelligence, and patience levels - "
				+ "\nPlease choose one by entering their assigned number below:"
				+ "\n(1) Miranda - Smart girl with a big temper"
				+ "\n(2) Albert - A wise gentleman"
				+ "\n(3) Jackie - Ditzy, but cool"
				+ "\nBest of luck getting to your interview without losing it!";
	}
	
	
	
	
	
	
	
}
