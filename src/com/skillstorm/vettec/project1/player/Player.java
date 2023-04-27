package com.skillstorm.vettec.project1.player;


//import com.skillstorm.vettec.project1.scene;
//import com.skillstorm.vettec.project1.controller;

public class Player {
	protected static byte playerEnergy;
	protected static byte playerPatience;
	protected static byte playerIntelligence;
	
	public Player() {
		Player.playerEnergy = 0;
		Player.playerPatience = 0;
		Player.playerIntelligence = 0;
	}
	
	public Player(byte playerEnergy, byte playerPatience, byte playerIntelligence) {
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
	
	@Override
	public String toString() {
		return "Players Miranda, Albert, and Jackie have different energy, intelligence, and patience levels - "
				+ "\nPlease choose one by entering their assigned number below:"
				+ "\n(1) Miranda - Smart girl with a big temper"
				+ "\n(2) Albert - A wise gentleman"
				+ "\n(3) Jackie - Ditzy, but cool"
				+ "\nBest of luck getting to your interview without losing it!";
	}
	
	
	
	
	
	
	
}
