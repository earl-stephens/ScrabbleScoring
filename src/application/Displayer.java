package application;

import java.util.Scanner;

public class Displayer {
	Scoring scoring = new Scoring();
	
	public void start() {
		System.out.println("Welcome to Scrabble Scoring!");
		System.out.println("Press 1 to stop playing.");
		play();
	}
	
	public void play() {
		Scanner scanner = new Scanner(System.in);
		String word;
		while(true) {
		System.out.println("Please enter the word you want to score: ");
		
		word = scanner.nextLine();
		if(word.equals("1")) break;
		
		System.out.println("The word's score is " + scoring.scores(word));
		}
		
		scanner.close();
		System.out.println("Thanks for playing!");
	}
}
