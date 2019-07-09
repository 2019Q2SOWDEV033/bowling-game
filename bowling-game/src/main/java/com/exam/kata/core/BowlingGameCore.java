package com.exam.kata.core;

public class BowlingGameCore {
	
	public int getScore(String lineOfBowling) {
		if (lineOfBowling.substring(0,1).equals("-")){
            return 0;
        }
        return 1;
	}

}
