package com.exam.kata.core;

public class BowlingGameCore {
	
	public int getScore(String lineOfBowling) {
		int result = 0;
        for (int i = 0; i < lineOfBowling.length(); i++){
        	result += rollScore(lineOfBowling, i);
        	if (i < lineOfBowling.length() - 1 && rollScore(lineOfBowling, i) + rollScore(lineOfBowling, i + 1) == 10) {
                result += rollScore(lineOfBowling, i + 2);
            }
        }
        return result;
	}
	
    private int rollScore(String rolls, int numberOfRoll) {
    	String score = rolls.substring(numberOfRoll, numberOfRoll + 1);
        if (score.equals("-")) {
            score = "0";
        } else if (score.equals("/")) {
            score = String.valueOf(10 - rollScore(rolls, numberOfRoll-1));
        } else if (score.equals("X")){
            score = "10";
        }
        return Integer.parseInt(score);
    }

}
