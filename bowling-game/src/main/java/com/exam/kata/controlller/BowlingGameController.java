package com.exam.kata.controlller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BowlingGameController
{
	@RequestMapping(value="/bowling-game/score", method = RequestMethod.GET)
    public @ResponseBody void getScore() {
    }
}