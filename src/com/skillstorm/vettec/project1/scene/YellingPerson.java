package com.skillstorm.vettec.project1.scene;

import java.util.Scanner;
import com.skillstorm.vettec.project1.player.*;

public class YellingPerson extends Scene {

	public YellingPerson() {
	}

	Scanner in = new Scanner(System.in);

	public void yPPlayScene(Player Miranda) {

		String choice = in.nextLine().toUpperCase().trim();
		if (choice.equals("A")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy()));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 2));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience()));
			INNER1: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println("Not the best choice. Here are your current stats:" + "\nEnergy: "
						+ Player.getPlayerEnergy() + ";" + "\nIntelligence: " + Player.getPlayerIntelligence() + ";"
						+ "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println(
						"You didn't make it to your interview, and your mom called you weak. Better luck next time! "
								+ "\nEnergy: " + Player.getPlayerEnergy() + ", " + "\nIntelligence: "
								+ Player.getPlayerIntelligence() + ", " + "\nPatience: " + Player.getPlayerPatience()
								+ ".");
				System.exit(0); // exit the game

			}
		} else if (choice.equals("B")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() - 1));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 2));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() - 1));
			INNER2: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println(
						"You won the fight, but it probably wasn't the best choice. Here are your current stats:"
								+ "\nEnergy: " + Player.getPlayerEnergy() + ";" + "\nIntelligence: "
								+ Player.getPlayerIntelligence() + ";" + "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println("You won the fight, but didn't make it to your interview, better luck next time! "
						+ "\nEnergy: " + Player.getPlayerEnergy() + ", " + "\nIntelligence: "
						+ Player.getPlayerIntelligence() + ", " + "\nPatience: " + Player.getPlayerPatience() + ".");
				System.exit(0); // exit the game

			}
		} else if (choice.equals("C")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() + 1));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() + 3));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience()));
			INNER3: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println("Good choice! Here are your current stats:" + "\nEnergy: " + Player.getPlayerEnergy()
						+ ";" + "\nIntelligence: " + Player.getPlayerIntelligence() + ";" + "\nPatience: "
						+ Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println("You didn't make it to your interview, better luck next time! " + "\nEnergy: "
						+ Player.getPlayerEnergy() + ", " + "\nIntelligence: " + Player.getPlayerIntelligence() + ", "
						+ "\nPatience: " + Player.getPlayerPatience() + ".");
				System.exit(0); // exit the game

			} else {
				System.out.println("Invalid entry");

			}
		}
	}

	public void yPPlayScene2(Player Albert) {

		String choice = in.nextLine().toUpperCase().trim();
		if (choice.equals("A")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy()));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 2));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience()));
			INNER1: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println("Not the best choice. Here are your current stats:" + "\nEnergy: "
						+ Player.getPlayerEnergy() + ";" + "\nIntelligence: " + Player.getPlayerIntelligence() + ";"
						+ "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println("You didn't make it to your interview, better luck next time! " + "\nEnergy: "
						+ Player.getPlayerEnergy() + ", " + "\nIntelligence: " + Player.getPlayerIntelligence() + ", "
						+ "\nPatience: " + Player.getPlayerPatience() + ".");
				System.exit(0); // exit the game

			}
		} else if (choice.equals("B")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() - 2));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 3));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() - 1));
			INNER2: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println("You lost the fight but you're still in it! Here are your current stats:"
						+ "\nEnergy: " + Player.getPlayerEnergy() + ";" + "\nIntelligence: "
						+ Player.getPlayerIntelligence() + ";" + "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println(
						"You got your butt kicked and didn't make it to your interview. Better luck next time! "
								+ "\nEnergy: " + Player.getPlayerEnergy() + ", " + "\nIntelligence: "
								+ Player.getPlayerIntelligence() + ", " + "\nPatience: " + Player.getPlayerPatience()
								+ ".");
				System.exit(0); // exit the game

			}
		} else if (choice.equals("C")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() + 1));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() + 3));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() + 1));
			INNER3: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println("That was a good choice, saving your energy. Here are your current stats:"
						+ "\nEnergy: " + Player.getPlayerEnergy() + ";" + "\nIntelligence: "
						+ Player.getPlayerIntelligence() + ";" + "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println("You didn't make it to your interview, better luck next time! " + "\nEnergy: "
						+ Player.getPlayerEnergy() + ", " + "\nIntelligence: " + Player.getPlayerIntelligence() + ", "
						+ "\nPatience: " + Player.getPlayerPatience() + ".");
				System.exit(0); // exit the game

			} else {
				System.out.println("Invalid entry");

			}
		}
	}

	public void yPPlayScene3(Player Jackie) {

		String choice = in.nextLine().toUpperCase().trim();
		if (choice.equals("A")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy()));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 1));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience()));
			INNER1: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println("Not the best choice, and your mom called you weak. Here are your current stats:"
						+ "\nEnergy: " + Player.getPlayerEnergy() + ";" + "\nIntelligence: "
						+ Player.getPlayerIntelligence() + ";" + "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println("You didn't make it to your interview, better luck next time! " + "\nEnergy: "
						+ Player.getPlayerEnergy() + ", " + "\nIntelligence: " + Player.getPlayerIntelligence() + ", "
						+ "\nPatience: " + Player.getPlayerPatience() + ".");
				System.exit(0); // exit the game

			}
		} else if (choice.equals("B")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() - 1));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() + 2));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() - 1));
			INNER2: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println("You kicked his butt! Here are your current stats:" + "\nEnergy: "
						+ Player.getPlayerEnergy() + ";" + "\nIntelligence: " + Player.getPlayerIntelligence() + ";"
						+ "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println("You won, didn't make it to your interview, better luck next time! " + "\nEnergy: "
						+ Player.getPlayerEnergy() + ", " + "\nIntelligence: " + Player.getPlayerIntelligence() + ", "
						+ "\nPatience: " + Player.getPlayerPatience() + ".");
				System.exit(0); // exit the game

			}
		} else if (choice.equals("C")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() + 1));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence()));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() + 2));
			INNER3: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out
						.println("That's a good choice, but you would have won the fight. Here are your current stats:"
								+ "\nEnergy: " + Player.getPlayerEnergy() + ";" + "\nIntelligence: "
								+ Player.getPlayerIntelligence() + ";" + "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println("You won the fight, but didn't make it to your interview, better luck next time! "
						+ "\nEnergy: " + Player.getPlayerEnergy() + ", " + "\nIntelligence: "
						+ Player.getPlayerIntelligence() + ", " + "\nPatience: " + Player.getPlayerPatience() + ".");
				System.exit(0); // exit the game

			} else {
				System.out.println("Invalid entry");

			}
		}

	}

	@Override
	public String toString() {
		return "\n-------------------------------------------\n"
				+ "You pull up to a stoplight, and a random man starts to yell" + "\ninsults at you out the window. "
				+ "\nYou try and hide your face, but he begins to open the door. " + "\nWhat do you do next?"
				+ "\nA. Start crying and call your mom" + "\nB. Open the door and start yelling back"
				+ "\nC. Roll up your windows and lock your doors";
	}
}
