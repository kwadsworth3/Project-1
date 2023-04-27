package com.skillstorm.vettec.project1.controller;
import com.skillstorm.vettec.project1.player.Albert;
import com.skillstorm.vettec.project1.player.Jackie;
import com.skillstorm.vettec.project1.player.Miranda;
import com.skillstorm.vettec.project1.player.Player;
import com.skillstorm.vettec.project1.scene.Scene;
import com.skillstorm.vettec.project1.scene.GasStation;
import com.skillstorm.vettec.project1.scene.FightingMan;
import java.util.Scanner;
import java.util.ArrayList;


public class Project1Controller {

	public static void main(String[] args) {
		
//		Player player = new Player();
//		Player albert = new Albert();
//		Player miranda = new Miranda();
//		Player jackie = new Jackie();
//		System.out.println(player);
//		System.out.println(miranda);
//		System.out.println(albert);
//		System.out.println(jackie.getPlayerEnergy());
		Player openingLine = new Player();
		System.out.println(openingLine);

		Scanner in = new Scanner(System.in);
		int user = in.nextInt();
		
		// choose a player to set your static variables

		PLAYER : 
		if (user == 1) {
			Player character = new Miranda();
			System.out.println(character);
			break PLAYER;
		} else if (user == 2) {
			Player character = new Albert();
			System.out.println(character);
			break PLAYER;
		} else if (user == 3) {
			Player character = new Jackie();
			System.out.println(character);
			break PLAYER;
		} else {
			System.out.println("Please enter a valid response.");
//			continue PLAYER; - ask for help debugging, make an exception class
		}
		
		System.out.println("\n-------------------------------------------\n");
		
//		Scene openingScene = new Scene();
//		System.out.println(openingScene); // add in before the array list
//		Scene trying = new GasStation(); // will prob need to use instance of in next loop
//		System.out.println(trying);
		
//		ArrayList<Scene> middleClasses = new ArrayList<>();
//		add.middleClass(0) = ;
//		add.middleClass(1) = ;
//		add.middleClass(2) = ;
		Scene check = new FightingMan();
		System.out.println(check);
		
		
		
		in.close();
	}
	
	
}
