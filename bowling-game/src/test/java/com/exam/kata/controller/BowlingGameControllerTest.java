package com.exam.kata.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.exam.kata.controller.BowlingGameController;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public class BowlingGameControllerTest
{
 
    @InjectMocks
    private BowlingGameController bowlGameController;
 
    private MockMvc mockMvc;
 
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(bowlGameController).build();
    }
    
    @Test
    public void testControllerStatus200AndReturnScoreAsResponseForBowlingScoreService() throws Exception {
    	MvcResult result = this.mockMvc.perform(get("/bowling-game/score")
        		    .param("lineOfBowling", "XXXXXXXXXXXX"))
                    .andExpect(status().isOk())
                    .andReturn();
    	assertEquals("300",result.getResponse().getContentAsString());
    }
}