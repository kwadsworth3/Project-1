package com.skillstorm.vettec.project1.controller;

import com.skillstorm.vettec.project1.player.*;
import com.skillstorm.vettec.project1.scene.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Project1Controller {

	public static void main(String[] args) {

		Player openingLine = new Player();
		System.out.println(openingLine); // read from opening scene

		Scanner in = new Scanner(System.in);
		int user = in.nextInt();

		// choose a player to set your static variables
		PLAYER: if (user == 1) {
			Player character = new Miranda();
			System.out.println(character);
			System.out.println("\n-------------------------------------------\n");

			Scene openingScene = new Scene();
			System.out.println(openingScene); // add in before the array list to allow to always run
			openingScene.oSPlayScene(character);

			ArrayList<Scene> sceneList = new ArrayList<>(); // could have put this under Scene Class
			FightingMan fightingManScene = new FightingMan();
			DeflatedTire deflatedTireScene = new DeflatedTire();
			YellingPerson yellingPersonScene = new YellingPerson();
			ReceptionistMessedUp receptionistScene = new ReceptionistMessedUp();
			GasStation gasStationScene = new GasStation();
			sceneList.add(fightingManScene);
			sceneList.add(deflatedTireScene);
			sceneList.add(yellingPersonScene);
			sceneList.add(receptionistScene);
			sceneList.add(gasStationScene);

			int count = 0;
			while (count < 3 && !sceneList.isEmpty()) { // create a loop to take you through 3 scenarios
				int randomIndex = (int) (Math.random() * sceneList.size());
				Scene randomValue = sceneList.get(randomIndex);
				sceneList.remove(randomIndex); // remove the random scene to not get it twice
				if (randomValue instanceof GasStation) {
					System.out.println(gasStationScene);
					gasStationScene.gSPlayScene(character);

				} else if (randomValue instanceof FightingMan) {
					System.out.println(fightingManScene);
					fightingManScene.fMPlayScene(character);

				} else if (randomValue instanceof DeflatedTire) {
					System.out.println(deflatedTireScene);
					deflatedTireScene.dTPlayScene(character);

				} else if (randomValue instanceof YellingPerson) {
					System.out.println(yellingPersonScene);
					yellingPersonScene.yPPlayScene(character);

				} else if (randomValue instanceof ReceptionistMessedUp) {
					System.out.println(receptionistScene);
					receptionistScene.rMPlayScene(character);

				} else {

				}
				count++;

			}

			break PLAYER;
		} else if (user == 2) {
			Player character = new Albert();
			System.out.println(character);
			System.out.println("\n-------------------------------------------\n");

			Scene openingScene = new Scene();
			System.out.println(openingScene); // add in before the array list to allow to always run
			openingScene.oSPlayScene2(character);

			ArrayList<Scene> sceneList = new ArrayList<>();
			FightingMan fightingManScene = new FightingMan();
			DeflatedTire deflatedTireScene = new DeflatedTire();
			YellingPerson yellingPersonScene = new YellingPerson();
			ReceptionistMessedUp receptionistScene = new ReceptionistMessedUp();
			GasStation gasStationScene = new GasStation();
			sceneList.add(fightingManScene);
			sceneList.add(deflatedTireScene);
			sceneList.add(yellingPersonScene);
			sceneList.add(receptionistScene);
			sceneList.add(gasStationScene);

			int count = 0;
			while (count < 3 && !sceneList.isEmpty()) {
				int randomIndex = (int) (Math.random() * sceneList.size());
				Scene randomValue = sceneList.get(randomIndex);

				sceneList.remove(randomIndex);
				if (randomValue instanceof GasStation) {
					System.out.println(gasStationScene);
					gasStationScene.gSPlayScene2(character);

				} else if (randomValue instanceof FightingMan) {
					System.out.println(fightingManScene);
					fightingManScene.fMPlayScene2(character);

				} else if (randomValue instanceof DeflatedTire) {
					System.out.println(deflatedTireScene);
					deflatedTireScene.dTPlayScene2(character);

				} else if (randomValue instanceof YellingPerson) {
					System.out.println(yellingPersonScene);
					yellingPersonScene.yPPlayScene2(character);

				} else if (randomValue instanceof ReceptionistMessedUp) {
					System.out.println(receptionistScene);
					receptionistScene.rMPlayScene2(character);

				} else {

				}
				count++;

			}

			break PLAYER;
		} else if (user == 3) {
			Player character = new Jackie();
			System.out.println(character);
			System.out.println("\n-------------------------------------------\n");

			Scene openingScene = new Scene();
			System.out.println(openingScene); // add in before the array list to allow to always run
			openingScene.oSPlayScene3(character);

			ArrayList<Scene> sceneList = new ArrayList<>();
			FightingMan fightingManScene = new FightingMan();
			DeflatedTire deflatedTireScene = new DeflatedTire();
			YellingPerson yellingPersonScene = new YellingPerson();
			ReceptionistMessedUp receptionistScene = new ReceptionistMessedUp();
			GasStation gasStationScene = new GasStation();
			sceneList.add(fightingManScene);
			sceneList.add(deflatedTireScene);
			sceneList.add(yellingPersonScene);
			sceneList.add(receptionistScene);
			sceneList.add(gasStationScene);

			int count = 0;
			while (count < 3 && !sceneList.isEmpty()) {
				int randomIndex = (int) (Math.random() * sceneList.size());
				Scene randomValue = sceneList.get(randomIndex);

				sceneList.remove(randomIndex);
				if (randomValue instanceof GasStation) {
					System.out.println(gasStationScene);
					try {
						gasStationScene.gSPlayScene3(character);
					} catch (Exception e) {
						System.out.println("Please enter a valid response.");
					}

				} else if (randomValue instanceof FightingMan) {
					System.out.println(fightingManScene);
					fightingManScene.fMPlayScene3(character);

				} else if (randomValue instanceof DeflatedTire) {
					System.out.println(deflatedTireScene);
					deflatedTireScene.dTPlayScene3(character);

				} else if (randomValue instanceof YellingPerson) {
					System.out.println(yellingPersonScene);
					yellingPersonScene.yPPlayScene3(character);

				} else if (randomValue instanceof ReceptionistMessedUp) {
					System.out.println(receptionistScene);
					receptionistScene.rMPlayScene3(character);

				} else {

				}
				count++;

			}

			break PLAYER;

		} else {
			System.out.println("Please enter a valid response after restarting game.");

			if (Player.getPlayerEnergy() >= 1 && Player.getPlayerIntelligence() >= 1 && Player.getPlayerPatience() >= 1)
				System.out.println("\n-------------------------------------------\n"
						+ "If you've made it this far, congratulations! You successfully made it to your interview. Here are your final stats: "
						+ "\nEnergy: " + Player.getPlayerEnergy() + ", " + "\nIntelligence: "
						+ Player.getPlayerIntelligence() + ", " + "\nPatience: " + Player.getPlayerPatience() + ".");

			in.close();

		}
	}
}
