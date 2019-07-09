package com.exam.kata.core;

public class BowlingGameCore {
	
	public int getScore(String lineOfBowling) {
		int result = 0;
        for (int i = 0; i < 20; i++){
        	result += rollScore(lineOfBowling, i);
        }
        return result;
	}
	
    private int rollScore(String rolls, int numberOfRoll) {
    	String score = rolls.substring(numberOfRoll, numberOfRoll + 1);
        if (score.equals("-")) {
            score = "0";
        } else if (score.equals("/")) {
            score = String.valueOf(10 - rollScore(rolls, numberOfRoll-1));
        }
        return Integer.parseInt(score);
    }

}
