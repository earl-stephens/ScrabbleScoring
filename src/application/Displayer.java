package application;

import java.util.Scanner;

public class Displayer {
	Scoring scoring = new Scoring();
	
	public void start() {
		System.out.println("Welcome to Scrabble Scoring!");
		System.out.println("Please enter the word you want to score: ");
		
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		
		System.out.println("The word's score is " + scoring.scores(word));
		
		scanner.close();
	}
}
