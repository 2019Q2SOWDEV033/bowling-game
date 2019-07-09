package com.exam.kata.core;

public class BowlingGameCore {
	
	public int getScore(String lineOfBowling) {
		String score = lineOfBowling.substring(0, 1);
        if (score.equals("-")){
            score = "0";
        }
        return Integer.parseInt(score);
	}

}
