package com.exam.kata.core;

public class BowlingGameCore {
	
	public static final String _DASH_FOR_MISS = "-";
	public static final String _SLASH_FOR_SPARE = "/";
	public static final String _CROSS_FOR_STRIKE = "X";
	
	public int getScore(String lineOfBowling) {
		int result = 0;
        for (int eachRoll = 0; eachRoll < lineOfBowling.length(); eachRoll++){
        	result += rollScore(lineOfBowling, eachRoll);
        	if (eachRoll % 2 == 0 && eachRoll < lineOfBowling.length() - 1 && rollScore(lineOfBowling, eachRoll) + rollScore(lineOfBowling, eachRoll + 1) == 10) {
                result += rollScore(lineOfBowling, eachRoll + 2);
            }
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

}
