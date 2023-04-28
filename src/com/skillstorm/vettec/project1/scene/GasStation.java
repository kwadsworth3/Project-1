package com.skillstorm.vettec.project1.scene;

import com.skillstorm.vettec.project1.player.Player;
import java.util.Scanner;

public class GasStation extends Scene {

	public GasStation() {
	}

	Scanner in = new Scanner(System.in);

	public void gSPlayScene(Player Miranda) {

		String choice = in.nextLine().toUpperCase().trim();
		if (choice.equals("A")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() - 1));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 1));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience()));
			INNER1: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println("Not the best choice, but you got it. Here are your current stats:" + "\nEnergy: "
						+ Player.getPlayerEnergy() + ";" + "\nIntelligence: " + Player.getPlayerIntelligence() + ";"
						+ "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println("You didn't get it back or make it to your interview, better luck next time! "
						+ "\nEnergy: " + Player.getPlayerEnergy() + ", " + "\nIntelligence: "
						+ Player.getPlayerIntelligence() + ", " + "\nPatience: " + Player.getPlayerPatience() + ".");
				System.exit(0); // exit the game

			}
		} else if (choice.equals("B")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() + 1));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() + 1));
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
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence()));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience()));
			INNER3: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println(
						"It didn't come out, but they might not notice. Keep going. Here are your current stats:"
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

	public void gSPlayScene2(Player Albert) {

		String choice = in.nextLine().toUpperCase().trim();
		if (choice.equals("A")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() - 3));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 2));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() - 1));
			INNER1: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println(
						"You are really lucky he dropped it, this could have given you a heart attack. Here are your current stats:"
								+ "\nEnergy: " + Player.getPlayerEnergy() + ";" + "\nIntelligence: "
								+ Player.getPlayerIntelligence() + ";" + "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println(
						"You didn't make it to your interview, and went into cardiac arrest. Better luck next time! "
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
				System.out.println("Good choice! They won't even see the stain. Here are your current stats:"
						+ "\nEnergy: " + Player.getPlayerEnergy() + ";" + "\nIntelligence: "
						+ Player.getPlayerIntelligence() + ";" + "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println("You didn't make it to your interview, better luck next time! " + "\nEnergy: "
						+ Player.getPlayerEnergy() + ", " + "\nIntelligence: " + Player.getPlayerIntelligence() + ", "
						+ "\nPatience: " + Player.getPlayerPatience() + ".");
				System.exit(0); // exit the game

			}
		} else if (choice.equals("C")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy()));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence()));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience()));
			INNER3: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println(
						"It didn't come out, but they might not notice. Keep going. Here are your current stats:"
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

	public void gSPlayScene3(Player Jackie) {

		String choice = in.nextLine().toUpperCase().trim();
		if (choice.equals("A")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() - 1));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() + 2));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() - 1));
			INNER1: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println("You got him and rightfully won the tide pen. Here are your current stats:"
						+ "\nEnergy: " + Player.getPlayerEnergy() + ";" + "\nIntelligence: "
						+ Player.getPlayerIntelligence() + ";" + "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println("You got him after a few blocks, but took too long. Better luck next time! "
						+ "\nEnergy: " + Player.getPlayerEnergy() + ", " + "\nIntelligence: "
						+ Player.getPlayerIntelligence() + ", " + "\nPatience: " + Player.getPlayerPatience() + ".");
				System.exit(0); // exit the game

			}
		} else if (choice.equals("B")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() + 1));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 1));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() + 1));
			INNER2: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println(
						"You were close to catching him, and now you're stuck with the stain...but still in it. Here are your current stats:"
								+ "\nEnergy: " + Player.getPlayerEnergy() + ";" + "\nIntelligence: "
								+ Player.getPlayerIntelligence() + ";" + "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println(
						"Your best choice was to catch him, they saw the stain and kicked you out for unprofessionalism before you even started. Better luck next time! "
								+ "\nEnergy: " + Player.getPlayerEnergy() + ", " + "\nIntelligence: "
								+ Player.getPlayerIntelligence() + ", " + "\nPatience: " + Player.getPlayerPatience()
								+ ".");
				System.exit(0); // exit the game

			}
		} else if (choice.equals("C")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy()));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence()));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience()));
			INNER3: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println(
						"It didn't come out, but they might not notice. Keep going. Here are your current stats:"
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

	@Override
	public String toString() {
		return "\n-------------------------------------------\n"
				+ "While drinking your morning coffee and driving, you hit a bump. "
				+ "\nLuckily, only a small coffee drop landed on your shirt. Your handy-dandy "
				+ "\ntide pen is dried out, so you stop by the gas station to purchase a new one. "
				+ "\nYou see the very last one on the shelf, but watch a stranger put it in their pocket and leave. "
				+ "\nWhat do you do next?" + "\n\nA. Run outside and chase the man down"
				+ "\nB. Cut your losses and leave" + "\nC. Try and wash it out in the bathroom";
	}
}