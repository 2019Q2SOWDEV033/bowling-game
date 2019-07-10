package com.exam.kata.core;

public class BowlingGameCore {
	
	public static final String _DASH_FOR_MISS = "-";
	public static final String _SLASH_FOR_SPARE = "/";
	public static final String _CROSS_FOR_STRIKE = "X";
	
	public int getScore(String lineOfBowling) {
		int result = 0;
		int numberOfRoll = 0;
        for (int turn = 0; turn < 10; turn++) {
            result += rollScore(lineOfBowling, numberOfRoll);
            result += rollScore(lineOfBowling, numberOfRoll + 1);
            result += additionalScore(lineOfBowling, numberOfRoll);
            numberOfRoll += 10 == rollScore(lineOfBowling, numberOfRoll) ? 1 : 2;
        }
        return result;
	}
	
    private int rollScore(String rolls, int numberOfRoll) {
    	String score = rolls.substring(numberOfRoll, numberOfRoll + 1);
        if (score.equals(_DASH_FOR_MISS)) {
            score = "0";
        } else if (score.equals(_SLASH_FOR_SPARE)) {
            score = String.valueOf(10 - rollScore(rolls, numberOfRoll-1));
        } else if (score.equals(_CROSS_FOR_STRIKE)){
            score = "10";
        }
        return Integer.parseInt(score);
    }
    
    private int additionalScore(String rolls, int numberOfRoll) {
        int additScore = 0;
        if (rollScore(rolls, numberOfRoll) + rollScore(rolls, numberOfRoll + 1) == 10) {
        	additScore = rollScore(rolls, numberOfRoll + 2);
        }
        return additScore;
    }

}
