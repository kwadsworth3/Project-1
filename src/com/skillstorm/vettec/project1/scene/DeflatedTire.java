package com.skillstorm.vettec.project1.scene;
import java.util.Scanner;
import com.skillstorm.vettec.project1.player.Player;

public class DeflatedTire extends Scene {
	
	public DeflatedTire() {}

	Scanner in = new Scanner(System.in);

	public void dTPlayScene(Player Miranda) {

		String choice = in.nextLine().toUpperCase().trim();
		if (choice.equals("A")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy()));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 1));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() + 1));
			INNER1: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println("AAA came to your rescue, but you took a lot of time and now have to speed. Here are your current stats:" + "\nEnergy: "
						+ Player.getPlayerEnergy() + ";" + "\nIntelligence: " + Player.getPlayerIntelligence() + ";"
						+ "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println("AAA took too long and didn't make it to your interview, better luck next time! " + "\nEnergy: "
						+ Player.getPlayerEnergy() + ", " + "\nIntelligence: " + Player.getPlayerIntelligence() + ", "
						+ "\nPatience: " + Player.getPlayerPatience() + ".");
				System.exit(0); // exit the game

			}
		} else if (choice.equals("B")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() - 2));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() + 2));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience()));
			INNER2: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println("Good choice! Here are your current stats:" + "\nEnergy: " + Player.getPlayerEnergy()
						+ ";" + "\nIntelligence: " + Player.getPlayerIntelligence() + ";" + "\nPatience: "
						+ Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println("You're now tired and didn't make it to your interview, better luck next time! " + "\nEnergy: "
						+ Player.getPlayerEnergy() + ", " + "\nIntelligence: " + Player.getPlayerIntelligence() + ", "
						+ "\nPatience: " + Player.getPlayerPatience() + ".");
				System.exit(0); // exit the game

			}
		} else if (choice.equals("C")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() + 1));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 2));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience()));
			INNER3: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println("Not the best choice... but hey you're still here. Here are your current stats:" + "\nEnergy: "
						+ Player.getPlayerEnergy() + ";" + "\nIntelligence: " + Player.getPlayerIntelligence() + ";"
						+ "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println("You didn't make it to your interview, and now your car is totalled because you pulled to the right and crashed. better luck next time! " + "\nEnergy: "
						+ Player.getPlayerEnergy() + ", " + "\nIntelligence: " + Player.getPlayerIntelligence() + ", "
						+ "\nPatience: " + Player.getPlayerPatience() + ".");
				System.exit(0); // exit the game

			} else {
				System.out.println("Invalid entry");

			}
		}
	}
	public void dTPlayScene2(Player Albert) {

		String choice = in.nextLine().toUpperCase().trim();
		if (choice.equals("A")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() + 1));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() + 3));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() + 1));
			INNER1: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println("Best choice you could have picked. Here are your current stats:" + "\nEnergy: "
						+ Player.getPlayerEnergy() + ";" + "\nIntelligence: " + Player.getPlayerIntelligence() + ";"
						+ "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println("AAA took too long and you didn't make it to your interview, better luck next time! " + "\nEnergy: "
						+ Player.getPlayerEnergy() + ", " + "\nIntelligence: " + Player.getPlayerIntelligence() + ", "
						+ "\nPatience: " + Player.getPlayerPatience() + ".");
				System.exit(0); // exit the game

			}
		} else if (choice.equals("B")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() - 1));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() + 2));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience()));
			INNER2: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println("You're smart enough to change a tire quickly, but remember you don't have much energy. Here are your current stats:" + "\nEnergy: " + Player.getPlayerEnergy()
						+ ";" + "\nIntelligence: " + Player.getPlayerIntelligence() + ";" + "\nPatience: "
						+ Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println("You're tired, but safe and the tire was swiftly changed. However, you didn't make it to your interview, better luck next time! " + "\nEnergy: "
						+ Player.getPlayerEnergy() + ", " + "\nIntelligence: " + Player.getPlayerIntelligence() + ", "
						+ "\nPatience: " + Player.getPlayerPatience() + ".");
				System.exit(0); // exit the game

			}
		} else if (choice.equals("C")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() + 1));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 2));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience()));
			INNER3: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println("Not the best choice, but you're still rolling. Here are your current stats:" + "\nEnergy: "
						+ Player.getPlayerEnergy() + ";" + "\nIntelligence: " + Player.getPlayerIntelligence() + ";"
						+ "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println("You didn't make it to your interview, and you know better. better luck next time! " + "\nEnergy: "
						+ Player.getPlayerEnergy() + ", " + "\nIntelligence: " + Player.getPlayerIntelligence() + ", "
						+ "\nPatience: " + Player.getPlayerPatience() + ".");
				System.exit(0); // exit the game

			} else {
				System.out.println("Invalid entry");

			}
		}
	}
	public void dTPlayScene3(Player Jackie) {

		String choice = in.nextLine().toUpperCase().trim();
		if (choice.equals("A")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() + 1));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() + 2));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience()));
			INNER1: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println("Good choice, but now you have to speed. Here are your current stats:" + "\nEnergy: "
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
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 2));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience() - 1));
			INNER2: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println("You didn't fully get it on, but somehow it's still rolling. Here are your current stats:" + "\nEnergy: " + Player.getPlayerEnergy()
						+ ";" + "\nIntelligence: " + Player.getPlayerIntelligence() + ";" + "\nPatience: "
						+ Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println("Never try to fix anything on your car again, now you're stranded on the middle of the interstate with your axle hitting the ground. You didn't make it to your interview, better luck next time! " + "\nEnergy: "
						+ Player.getPlayerEnergy() + ", " + "\nIntelligence: " + Player.getPlayerIntelligence() + ", "
						+ "\nPatience: " + Player.getPlayerPatience() + ".");
				System.exit(0); // exit the game

			}
		} else if (choice.equals("C")) {
			Player.setPlayerEnergy((byte) (Player.getPlayerEnergy() + 1));
			Player.setPlayerIntelligence((byte) (Player.getPlayerIntelligence() - 1));
			Player.setPlayerPatience((byte) (Player.getPlayerPatience()));
			INNER3: if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1
					&& Player.getPlayerPatience() >= 1) {
				System.out.println("Not the best choice for most people, but it's probably better that you didn't touch your tire. Here are your current stats:" + "\nEnergy: "
						+ Player.getPlayerEnergy() + ";" + "\nIntelligence: " + Player.getPlayerIntelligence() + ";"
						+ "\nPatience: " + Player.getPlayerPatience());
			} else if (Player.getPlayerEnergy() <= 0 || Player.getPlayerIntelligence() <= 0
					|| Player.getPlayerPatience() <= 0) {
				System.out.println("You didn't make it to your interview, but you also didn't completely destroy your vehicle. Better luck next time! " + "\nEnergy: "
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
				+ "You begin hearing a strange noise coming from your passenger side"
				+ "\ntire. You pull over, and get out to check if there is an "
				+ "\nissue and see that your tire is flat." + "\nWhat do you do next?"
				+ "\nA. Call AAA and use your parents account to get towed"
				+ "\nB. Attempt to change the tire yourself with your spare"
				+ "\nC. Turn the music up so you can't hear the noise and continue driving";
	}

}
