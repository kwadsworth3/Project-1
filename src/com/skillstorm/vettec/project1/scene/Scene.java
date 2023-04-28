package com.skillstorm.vettec.project1.scene;

import java.util.Scanner;

import com.skillstorm.vettec.project1.controller.Project1Controller;
import com.skillstorm.vettec.project1.player.Player;
import com.skillstorm.vettec.project1.player.Miranda;
import com.skillstorm.vettec.project1.player.Albert;
import com.skillstorm.vettec.project1.player.Jackie;

public class Scene {

	public Scene() {
	} // in future, would like to edit constructor to have choices built in

	Scanner in = new Scanner(System.in); // could not close scanner due to compilation issues

	public void oSPlayScene(Player Miranda) { // each player gets their own method so points are customizable
		String choice = in.nextLine().toUpperCase().trim(); // allows for clean user input
		if (choice.equals("A")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy())); // manipulating static variables
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 1));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience()));
			INNER1: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1 // player still able to
																								// continue game -
																								// either you make the
																								// interview or not
					&& Player.getPlayerPatience() >= 1) {
				System.out.println("Not the best choice. Here are your current stats:" + "\nEnergy: "
						+ Player.getPlayerEnergy() + ";" + "\nIntelligence: " + Player.getPlayerIntelligence() + ";"
						+ "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0 // if player loses, game
																							// ends
					|| Player.getPlayerPatience() <= 0) {
				System.out.println("Placeholder"); // keep in case variables want to be changed in future
				System.exit(0); // exit the game

			}
		} else if (choice.equals("B")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy()));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() + 2));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience()));
			INNER2: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println("Good choice! Here are your current stats:" + "\nEnergy: " + Player.getPlayerEnergy()
						+ ";" + "\nIntelligence: " + Player.getPlayerIntelligence() + ";" + "\nPatience: "
						+ Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println("Placeholder");
				System.exit(0); // exit the game

			}
		} else if (choice.equals("C")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy()));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 1));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience()));
			INNER3: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println("Not the best choice. Hopefully they like that band. Here are your current stats:"
						+ "\nEnergy: " + Player.getPlayerEnergy() + ";" + "\nIntelligence: "
						+ Player.getPlayerIntelligence() + ";" + "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println("Placeholder");
				System.exit(0); // exit the game

			} else {
				System.out.println("Invalid entry");

			}
		}
	}

	public void oSPlayScene2(Player Albert) {

		String choice = in.nextLine().toUpperCase().trim();
		if (choice.equals("A")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy())); // manipulating static variables
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 1));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience()));
			INNER1: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1 // player still able to
																								// continue game -
																								// either you make the
																								// interview or not
					&& Player.getPlayerPatience() >= 1) {
				System.out.println("Not the best choice. Here are your current stats:" + "\nEnergy: "
						+ Player.getPlayerEnergy() + ";" + "\nIntelligence: " + Player.getPlayerIntelligence() + ";"
						+ "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0 // if player loses, game
																							// ends
					|| Player.getPlayerPatience() <= 0) {
				System.out.println("Placeholder"); // keep in case variables want to be changed in future
				System.exit(0); // exit the game

			}
		} else if (choice.equals("B")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy()));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() + 2));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience()));
			INNER2: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println("Good choice! Here are your current stats:" + "\nEnergy: " + Player.getPlayerEnergy()
						+ ";" + "\nIntelligence: " + Player.getPlayerIntelligence() + ";" + "\nPatience: "
						+ Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println("Placeholder");
				System.exit(0); // exit the game

			}
		} else if (choice.equals("C")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy()));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 1));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience()));
			INNER3: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println("Not the best choice. Hopefully they like that band. Here are your current stats:"
						+ "\nEnergy: " + Player.getPlayerEnergy() + ";" + "\nIntelligence: "
						+ Player.getPlayerIntelligence() + ";" + "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println("Placeholder");
				System.exit(0); // exit the game

			} else {
				System.out.println("Invalid entry");

			}
		}
	}

	public void oSPlayScene3(Player Jackie) {

		String choice = in.nextLine().toUpperCase().trim();
		if (choice.equals("A")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy())); // manipulating static variables
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 1));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience()));
			INNER1: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1 // player still able to
																								// continue game -
																								// either you make the
																								// interview or not
					&& Player.getPlayerPatience() >= 1) {
				System.out.println("Not the best choice. Here are your current stats:" + "\nEnergy: "
						+ Player.getPlayerEnergy() + ";" + "\nIntelligence: " + Player.getPlayerIntelligence() + ";"
						+ "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0 // if player loses, game
																							// ends
					|| Player.getPlayerPatience() <= 0) {
				System.out.println("Placeholder"); // keep in case variables want to be changed in future
				System.exit(0); // exit the game

			}
		} else if (choice.equals("B")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy()));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() + 2));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience()));
			INNER2: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println("Good choice! Here are your current stats:" + "\nEnergy: " + Player.getPlayerEnergy()
						+ ";" + "\nIntelligence: " + Player.getPlayerIntelligence() + ";" + "\nPatience: "
						+ Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println("Placeholder");
				System.exit(0); // exit the game

			}
		} else if (choice.equals("C")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy()));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 1));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience()));
			INNER3: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println("Not the best choice. Hopefully they like that band. Here are your current stats:"
						+ "\nEnergy: " + Player.getPlayerEnergy() + ";" + "\nIntelligence: "
						+ Player.getPlayerIntelligence() + ";" + "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println("Placeholder");
				System.exit(0); // exit the game

			} else {
				System.out.println("Invalid entry");

			}
		}
	}

	@Override
	public String toString() { // can be overridden by subclasses so when System.out.println(obj of class) is
								// called, it prints the prompt
		return "Alright. You have until 2pm to make your interview. If you're dressed and in the car by 1pm, "
				+ "\nyou'll make it just on time...you're almost ready, however, you see that your puppy Max "
				+ "\nhas chewed all the buttons off the only nice shirt you own. What will you do next? "
				+ "\nEnter A, B, or C to choose." + "\nA. Sniff test last night's shirt and put it on. "
				+ "\nB. Run to your car and head to the nearest department store. "
				+ "\nC. Cry for 10 minutes, grab a band t-shirt and head out.";
	}

}
