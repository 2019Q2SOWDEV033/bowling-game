package com.exam.kata.controlller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.kata.core.BowlingGameCore;

@RestController
public class BowlingGameController
{
	@RequestMapping(value="/bowling-game/score", method = RequestMethod.GET)
    public @ResponseBody int getScore(@RequestParam String lineOfBowling) {
		BowlingGameCore bowlGameCore = new BowlingGameCore();
		return bowlGameCore.getScore(lineOfBowling);
    }
}