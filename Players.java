package com.day11_12Assignment;

import java.util.Scanner;

public class Players {

	public static void main(String[] args) {
		        
		/**
		 * calling methods here in main method to run the program
		 */
		System.out.println("\nPress 1 > for view 4 players cards");
		DeckOfCards play = new DeckOfCards();
		Scanner scanner = new Scanner(System.in);
		int press = scanner.nextInt();

		switch (press) {
		case 1:
			play.getCardCombination();
			play.getPlayer();
			break;
		}
	}

}
