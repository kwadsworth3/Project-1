package com.skillstorm.vettec.project1.scene;

import com.skillstorm.vettec.project1.player.Player;
import java.util.Scanner;

public class FightingMan extends Scene {

	public FightingMan() {
	}

	Scanner in = new Scanner(System.in);

	public void fMPlayScene(Player Miranda) {

		String choice = in.nextLine().toUpperCase().trim();
		if (choice.equals("A")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() - 1));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence()));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() - 1));
			INNER1: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println(
						"The police arrive after you blocked his car from leaving - but you turn your head and realize your identical vehicle is parked two spots down. Here are your current stats:"
								+ "\nEnergy: " + Player.getPlayerEnergy() + ";" + "\nIntelligence: "
								+ Player.getPlayerIntelligence() + ";" + "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println(
						"You didn't make it to your interview, and the police ran your license, only to find several unpaid parking tickets. You wind up in jail and don't make the interview. better luck next time! "
								+ "\nEnergy: " + Player.getPlayerEnergy() + ", " + "\nIntelligence: "
								+ Player.getPlayerIntelligence() + ", " + "\nPatience: " + Player.getPlayerPatience()
								+ ".");
				System.exit(0); // exit the game

			}
		} else if (choice.equals("B")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy()));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() + 2));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() + 2));
			INNER2: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println(
						"Good choice! You turn your head and see your identical vehicle is parked two spots down. Here are your current stats:"
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
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() - 1));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 2));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() - 1));
			INNER3: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println(
						"Not the best choice. Your identical vehicle was parked just two spaces over. Here are your current stats:"
								+ "\nEnergy: " + Player.getPlayerEnergy() + ";" + "\nIntelligence: "
								+ Player.getPlayerIntelligence() + ";" + "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println(
						"You didn't make it to your interview, and the police ran your license, only to find several unpaid parking tickets. You wind up in jail and don't make the interview. Better luck next time! "
								+ "\nEnergy: " + Player.getPlayerEnergy() + ", " + "\nIntelligence: "
								+ Player.getPlayerIntelligence() + ", " + "\nPatience: " + Player.getPlayerPatience()
								+ ".");
				System.exit(0); // exit the game

			} else {
				System.out.println("Invalid entry");

			}
		}
	}

	public void fMPlayScene2(Player Albert) {

		String choice = in.nextLine().toUpperCase().trim();
		if (choice.equals("A")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() + 1));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 1));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() + 1));
			INNER1: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println(
						"The police arrive after you blocked his car from leaving - but you turn your head and realize your identical vehicle is parked two spots down. Here are your current stats:"
								+ "\nEnergy: " + Player.getPlayerEnergy() + ";" + "\nIntelligence: "
								+ Player.getPlayerIntelligence() + ";" + "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println(
						"You didn't make it to your interview, and the police ran your license, only to find several unpaid parking tickets. You wind up in jail and don't make the interview. better luck next time!  "
								+ "\nEnergy: " + Player.getPlayerEnergy() + ", " + "\nIntelligence: "
								+ Player.getPlayerIntelligence() + ", " + "\nPatience: " + Player.getPlayerPatience()
								+ ".");
				System.exit(0); // exit the game

			}
		} else if (choice.equals("B")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy()));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() + 2));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() + 2));
			INNER2: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println(
						"Good choice! You turn your head and see your identical vehicle is parked two spots down. Here are your current stats:"
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
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() - 1));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 2));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() - 1));
			INNER3: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println(
						"Not the best choice. Your identical vehicle was parked just two spaces over. Here are your current stats:"
								+ "\nEnergy: " + Player.getPlayerEnergy() + ";" + "\nIntelligence: "
								+ Player.getPlayerIntelligence() + ";" + "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println(
						"You didn't make it to your interview, and the police ran your license, only to find several unpaid parking tickets...and you threw out your back. You wind up in jail and don't make the interview. Better luck next time! "
								+ "\nEnergy: " + Player.getPlayerEnergy() + ", " + "\nIntelligence: "
								+ Player.getPlayerIntelligence() + ", " + "\nPatience: " + Player.getPlayerPatience()
								+ ".");
				System.exit(0); // exit the game

			} else {
				System.out.println("Invalid entry");

			}
		}
	}

	public void fMPlayScene3(Player Jackie) {

		String choice = in.nextLine().toUpperCase().trim();
		if (choice.equals("A")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() - 1));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 3));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() - 2));
			INNER1: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println(
						"The police arrive after you blocked his car from leaving - but you turn your head and realize your identical vehicle is parked two spots down. Here are your current stats:"
								+ "\nEnergy: " + Player.getPlayerEnergy() + ";" + "\nIntelligence: "
								+ Player.getPlayerIntelligence() + ";" + "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println(
						"You didn't make it to your interview, and the police ran your license, only to find several unpaid parking tickets. You wind up in jail and don't make the interview. Better luck next time!  "
								+ "\nEnergy: " + Player.getPlayerEnergy() + ", " + "\nIntelligence: "
								+ Player.getPlayerIntelligence() + ", " + "\nPatience: " + Player.getPlayerPatience()
								+ ".");
				System.exit(0); // exit the game

			}
		} else if (choice.equals("B")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy()));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() + 2));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() + 2));
			INNER2: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println(
						"Good choice, but you could have taken him! You turn your head and see your identical vehicle is parked two spots down.  Here are your current stats:"
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
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 1));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() - 1));
			INNER3: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println(
						"You successfully got him out... but your identical vehicle was parked just two spaces over.  Here are your current stats:"
								+ "\nEnergy: " + Player.getPlayerEnergy() + ";" + "\nIntelligence: "
								+ Player.getPlayerIntelligence() + ";" + "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println(
						"You didn't make it to your interview, and the police ran your license, only to find several unpaid parking tickets. You wind up in jail and don't make the interview. Better luck next time! "
								+ "\nEnergy: " + Player.getPlayerEnergy() + ", " + "\nIntelligence: "
								+ Player.getPlayerIntelligence() + ", " + "\nPatience: " + Player.getPlayerPatience()
								+ ".");
				System.exit(0); // exit the game

			} else {
				System.out.println("Invalid entry");

			}
		}
	}

	@Override
	public String toString() {
		return "\n-------------------------------------------\n"
				+ "You decide to stop at Target to get a new shirt. However, you spent a lot of time "
				+ "\ngetting sidetracked in the Home Goods section, so you had to quickly run to your car. "
				+ "\nAs you make your way out of the store, you notice an unfamiliar man opening your car's door. "
				+ "\nYou quickly run towards him and ask him to stop, for which he replies, 'You wanna fight?'"
				+ "\nWhat do you do next?" + "\n\nA. Run and call the police" + "\nB. Take two deep breaths"
				+ "\nC. Pull him out and try to fight him off";
	}
}
