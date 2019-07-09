package com.exam.kata.core;

public class BowlingGameCore {
	
	public int getScore(String lineOfBowling) {
		int result = 0;
        for (int i = 0; i < 20; i++){
            String score = lineOfBowling.substring(i, i+1);
            if (score.equals("-")){
                score = "0";
            }
            result += Integer.parseInt(score);
        }
        return result;
	}

}
