package com.exam.kata.core;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.Description;

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
	 
	 @Test
	 public void testGameScore10WhenFirstFrameIsSpareAndRestMiss() {
		int score = bowlGameCore.getScore("3/------------------");
		assertEquals(10, score);
	 }
	 
	 @Test
	 public void testGameScore10WhenFirstFrameIsStrikeAndRestMiss() {
		int score = bowlGameCore.getScore("X------------------");
		assertEquals(10, score);
	 }
	 
	 @Test
	 @Description(value="Test if Game Score is 16 with Next Frame First Roll Score Added Correctly to the first frame When First Frame is Strike followed by some pins in second frame and Rest all are Missed")
	 public void testGameScore16WhenFirstFrameIsStrikeSecondNumberAndRestMissAndNextFrameScoreAddition() {
		int score = bowlGameCore.getScore("3/3-----------------");
		assertEquals(16, score);
	 }
	 
	 @Test
	 public void testGameScore16TwoConsecutiveScoreFrameWithSomePinsAndRestMiss() {
		int score = bowlGameCore.getScore("3553----------------");
		assertEquals(16, score);
	 }
	 
	 @Test
	 @Description(value="Test Game Score If a Strike Present in First Frame and Two consecutive frame score Will added to the first frame score. Considered Rest of the first two frames pins are missed")
	 public void testGameScoreIsNextTwoRollsScoreAdditionForStrike() {
		int score = bowlGameCore.getScore("X53----------------");
		assertEquals(26, score);
	 }
	 
	 @Test
	 public void testGameMaxScore300ForFullStrike() {
		int score = bowlGameCore.getScore("XXXXXXXXXXXX");
		assertEquals(300, score);
	 }
}
