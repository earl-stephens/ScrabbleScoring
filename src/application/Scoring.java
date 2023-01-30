package application;

import java.util.HashMap;

public class Scoring {
	private HashMap<String, Integer> letterScores = new HashMap<String, Integer>();
	
	public Scoring() {
		letterScores.put("A", 1);
		letterScores.put("B", 3);
		letterScores.put("C", 3);
		letterScores.put("D", 2);
		letterScores.put("E", 1);
		letterScores.put("F", 4);
		letterScores.put("G", 2);
		letterScores.put("H", 4);
		letterScores.put("I", 1);
		letterScores.put("J", 8);
		letterScores.put("K", 5);
		letterScores.put("L", 1);
		letterScores.put("M", 3);
		letterScores.put("N", 1);
		letterScores.put("O", 1);
		letterScores.put("P", 3);
		letterScores.put("Q", 10);
		letterScores.put("R", 1);
		letterScores.put("S", 1);
		letterScores.put("T", 1);
		letterScores.put("U", 1);
		letterScores.put("V", 4);
		letterScores.put("W", 4);
		letterScores.put("X", 8);
		letterScores.put("Y", 4);
		letterScores.put("Z", 10);
		}
	
	public int scores(String word) {
		int value = 0;
		
		for(char letter : breakUpWord(word)) {
			String letterKey = String.valueOf(letter).toUpperCase();
			value += letterScores.get(letterKey);
		}
		
		return value;
	}
	
	private char[] breakUpWord(String word) {
		char[] letters;
		letters = word.toCharArray();
		
		return letters;
	}
}
