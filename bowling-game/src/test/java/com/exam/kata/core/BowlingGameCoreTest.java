package com.exam.kata.core;

import org.junit.Before;
import org.junit.Test;

import com.exam.kata.core.BowlingGameCore;

import static org.junit.Assert.assertEquals;

public class BowlingGameCoreTest {
	
	BowlingGameCore bowlGameCore;
	
	@Before
	public void beforeFunction(){
		bowlGameCore = new BowlingGameCore();
	}
	
	@Test
	public void testGameScoreForAllZeroRoll() {
		BowlingGameCore bowlGameCore = new BowlingGameCore();
		int score = bowlGameCore.getScore("--------------------");
		assertEquals(0, score);
   	}
	
	 @Test
	 public void testGameScoreForFirstRollOnePinAndRestAllZeroRoll(){
	    int score = bowlGameCore.getScore("1-------------------");
	    assertEquals(1, score);
	 }
	 
	 @Test
	 public void testGameScoreForFirstRollTwoPinAndRestAllZeroRoll(){
		int score = bowlGameCore.getScore("2-------------------");
		assertEquals(2, score);
	 }
	 
	 @Test
	 public void testGameScoreFor20WhenAllRollsAreOne(){
		int score = bowlGameCore.getScore("11111111111111111111");
		assertEquals(20, score);
	 }

}
