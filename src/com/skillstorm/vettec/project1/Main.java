package com.skillstorm.vettec.project1;

import java.util.Scanner;

public class Main {

	private static byte playerEnergy = 12;
	private static byte playerPatience = 12;
	private static byte playerIntelligence = 12;

	public static byte getPlayerEnergy() {
		return playerEnergy;
	}

	public static void setPlayerEnergy(byte playerEnergy) {
		Main.playerEnergy = playerEnergy;
	}

	public static byte getPlayerPatience() {
		return playerPatience;
	}

	public static void setPlayerPatience(byte playerPatience) {
		Main.playerPatience = playerPatience;
	}

	public static byte getPlayerIntelligence() {
		return playerIntelligence;
	}

	public static void setPlayerIntelligence(byte playerIntelligence) {
		Main.playerIntelligence = playerIntelligence;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Please enter your name:");
		String playerName = in.nextLine();
		System.out.println("Good mor....evening " + playerName
				+ "! It's nice to see you're finally awake. You have an interview in two hours across town. \nHere's how you're doing so far: \n"
				+ getPlayerEnergy() + " points of energy from the entire pot of coffee you drank. \n"
				+ getPlayerPatience() + " points of patience that you usually lose by the end of the day.\n"
				+ "annnnnnd " + getPlayerIntelligence() + " points of intelligence, suprisingly.");
				// Introduction
		
		// Begin Story
		
		
		
		
		in.close();
	}

}
