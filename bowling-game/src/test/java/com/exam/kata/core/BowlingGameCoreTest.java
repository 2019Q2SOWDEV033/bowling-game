package com.exam.kata.core;

import org.junit.Test;

import com.exam.kata.core.BowlingGameCore;

import static org.junit.Assert.assertEquals;

public class BowlingGameCoreTest {
	
	@Test
	public void testGameScoreForAllZeroRoll() {
		BowlingGameCore bowlGameCore = new BowlingGameCore();
		int score = bowlGameCore.getScore("--------------------");
		assertEquals(0, score);
   	}
	
	 @Test
	 public void testGameScoreForFirstRollOnePinAndRestAllZeroRoll(){
		BowlingGameCore bowlGameCore = new BowlingGameCore();
	    int score = bowlGameCore.getScore("1-------------------");
	    assertEquals(1, score);
	 }

}
