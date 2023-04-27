package com.skillstorm.vettec.project1.scene;

import com.skillstorm.vettec.project1.controller.Project1Controller;
import com.skillstorm.vettec.project1.player.Player;
import com.skillstorm.vettec.project1.player.Miranda;
import com.skillstorm.vettec.project1.player.Albert;
import com.skillstorm.vettec.project1.player.Jackie;

public class Scene {
	
	private static String choiceA;
	private static String choiceB;
	private static String choiceC;

//	public Scene() {
//		String Scene.choiceA = "Choice A does not exist";
//		String choiceB = "Choice B does not exist";
//		String choiceC = "Choice C does not exist";
//
//	}
//	
//	public Scene(String choiceA, String choiceB, String choiceC) {
//		String choiceA = "1. Sniff test last night's shirt and put it on.";
//		String choiceB = "2. Run to your car and head to the nearest department store.";
//		String choiceC = "3. Cry for 10 minutes, grab a band t-shirt and head out.";
//	}
	
	public static String getChoiceA() {
		return choiceA;
	}
	public static void setChoiceA(String choiceA) {
		Scene.choiceA = choiceA;
	}
	public static String getChoiceB() {
		return choiceB;
	}
	public static void setChoiceB(String choiceB) {
		Scene.choiceB = choiceB;
	}
	public static String getChoiceC() {
		return choiceC;
	}
	public static void setChoiceC(String choiceC) {
		Scene.choiceC = choiceC;
	}

//	public void deepBreath() {
//		System.out.println("It's a good thing you practiced your patience, because when you look to the right, "
//				+ "\nyou see your actual identical car is parked a few spaces over. "
//				+ "\nYou drive to your interview in your brand new shirt. As soon as you arrive, "
//				+ "\nyou check your paperwork. They spelled your name wrong. " 
//				+ "\nWhat do you do next?");
//		System.out.println("A. Get angry and yell at the receptionist."); // parking ticket jail
//		System.out.println("B. Cross it out and correct the spelling"); // interview calculations
//		System.out.println("C. Pretend like nothing is wrong"); // interview calculations
//
//	}
//
//	public void callPolice() {
//		System.out.println("You call the police, but their estimated time of arrival will make you late "
//				+ "\nto your interview. If you left within the next 5 minutes, you would make it with "
//				+ "\nenough time to fix and prepare yourself. However, if you aren't there to provide your "
//				+ "\n information, they will be less likely to be able to help you."
//				+ "\nWhat do you do next?");
//		System.out.println("A. Get in your car and drive.");
//		System.out.println("B. Stay to make a police report.");
//		System.out.println("C. Sit down and start calling your bank to freeze all transactions.");
//
//	}
//	

//	}
//	
//	public void parkingTicketJail() {
//		System.out.println("The police arrive and take down all of your personal "
//				+ "\ninformation to be provided on the official report. "
//				+ "\nAs they are scanning your driver's license, they realize you have an "
//				+ "\noverdue parking ticket from 12 years ago. You don't have the money "
//				+ "\nto pay the overdue fees. They take your to jail for inprocessing.");
//		System.out.println("Enter 'A' to restart the game before you get to jail for a second chance!");
//		System.out.println("Press 'B' to accept your fate.");
//
//
//	}

//
//	}
//	public void fightMan(String[] args) {
//		System.out.println("You call the police, but their estimated time of arrival will make you late "
//				+ "\nto your interview. If you left within the next 5 minutes, you would make it with "
//				+ "\nenough time to fix and prepare yourself. However, if you aren't there to provide your "
//				+ "\n information, they will be less likely to be able to help you."
//				+ "\nWhat do you do next?");
//		System.out.println("A. Get in your car and drive.");
//		System.out.println("B. Stay to make a police report.");
//		System.out.println("C. Sit down and start calling your bank to freeze all transactions.");
//
//	}
//	@Override
//	public String toString() {
//		return "Alright. You have until 2pm to make your interview. If you're dressed and in the car by 1pm, "
//				+ "\nyou'll make it just on time...you're almost ready, however, you see that your puppy Max "
//				+ "\nhas chewed all the buttons off the only nice shirt you own. What will you do next? "
//				+ "\nEnter A, B, or C to choose." + "\nA. Sniff test last night's shirt and put it on. "
//				+ "\nB. Run to your car and head to the nearest department store. "
//				+ "\nC. Cry for 10 minutes, grab a band t-shirt and head out.";
//	}

}
