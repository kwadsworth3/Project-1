package com.skillstorm.vettec.project1.scene;

import java.util.Scanner;

import com.skillstorm.vettec.project1.player.Player;

public class ReceptionistMessedUp extends Scene { // add choices

	public ReceptionistMessedUp() {
	}

	Scanner in = new Scanner(System.in);

	public void rMPlayScene(Player Miranda) {

		String choice = in.nextLine().toUpperCase().trim();
		if (choice.equals("A")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() - 1));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 3));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() - 2));
			INNER1: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println(
						"Not the best choice. You still have the interview, but probably won't be hired after that. Here are your current stats:"
								+ "\nEnergy: " + Player.getPlayerEnergy() + ";" + "\nIntelligence: "
								+ Player.getPlayerIntelligence() + ";" + "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println(
						"You didn't make it to your interview, which is fine because they didn't want you there after that call. Better luck next time! "
								+ "\nEnergy: " + Player.getPlayerEnergy() + ", " + "\nIntelligence: "
								+ Player.getPlayerIntelligence() + ", " + "\nPatience: " + Player.getPlayerPatience()
								+ ".");
				System.exit(0); // exit the game

			}
		} else if (choice.equals("B")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() + 1));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() + 2));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() + 1));
			INNER2: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
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

			}
		} else if (choice.equals("C")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy()));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 2));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() - 2));
			INNER3: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
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

			} else {
				System.out.println("Invalid entry");

			}
		}
	}

	public void rMPlayScene2(Player Albert) {

		String choice = in.nextLine().toUpperCase().trim();
		if (choice.equals("A")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() - 1));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 3));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() - 2));
			INNER1: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println(
						"Not the best choice. You still have the interview, but probably won't be hired after that. Here are your current stats:"
								+ "\nEnergy: " + Player.getPlayerEnergy() + ";" + "\nIntelligence: "
								+ Player.getPlayerIntelligence() + ";" + "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println(
						"You didn't make it to your interview, which is fine because they wouldn't hire you after that call. Better luck next time! "
								+ "\nEnergy: " + Player.getPlayerEnergy() + ", " + "\nIntelligence: "
								+ Player.getPlayerIntelligence() + ", " + "\nPatience: " + Player.getPlayerPatience()
								+ ".");
				System.exit(0); // exit the game

			}
		} else if (choice.equals("B")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() + 1));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() + 2));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() + 1));
			INNER2: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
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

			}
		} else if (choice.equals("C")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy()));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 2));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() - 2));
			INNER3: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
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

			} else {
				System.out.println("Invalid entry");

			}
		}
	}

	public void rMPlayScene3(Player Jackie) {

		String choice = in.nextLine().toUpperCase().trim();
		if (choice.equals("A")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() - 1));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 3));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() - 2));
			INNER1: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println(
						"Not the best choice. You still have the interview, but probably won't be hired after that. Here are your current stats:"
								+ "\nEnergy: " + Player.getPlayerEnergy() + ";" + "\nIntelligence: "
								+ Player.getPlayerIntelligence() + ";" + "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println(
						"You didn't make it to your interview, which is fine because they wouldn't hire you after that call. Better luck next time! "
								+ "\nEnergy: " + Player.getPlayerEnergy() + ", " + "\nIntelligence: "
								+ Player.getPlayerIntelligence() + ", " + "\nPatience: " + Player.getPlayerPatience()
								+ ".");
				System.exit(0); // exit the game

			}
		} else if (choice.equals("B")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() + 1));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() + 2));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() + 1));
			INNER2: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
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

			}
		} else if (choice.equals("C")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy()));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 2));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() - 2));
			INNER3: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
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

			} else {
				System.out.println("Invalid entry");

			}
		}
	}

	@Override
	public String toString() {
		return "\n-------------------------------------------\n"
				+ "You get a phonecall from the receptionist. She starts to check your paperwork,"
				+ "\nand as she's reading it back to you, you notice your name is wrong."
				+ "\nYou have already been through a lot today." + "\nWhat do you do next?"
				+ "\nA. Get angry and yell at the receptionist."
				+ "\nB. Take a few seconds, breathe deep, and correct the name."
				+ "\nC. Hang up the phone and plan to tell her you lost the call";
	}
}
