package com.game.rockpaperscissors.service;

import com.game.rockpaperscissors.model.Choice;
import com.game.rockpaperscissors.model.GameResult;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameServiceTest {

    private GameService gameService = new GameService();

    @Test
    void testPlayGame() {
        Choice userChoice = Choice.ROCK;
        GameResult result = gameService.playGame(userChoice);
        assertNotNull(result);
        assertNotNull(result.getUserChoice());
        assertNotNull(result.getComputerChoice());
        assertNotNull(result.getResult());
    }

    @Test
    void testDetermineResult() {
        GameService gameService = new GameService();
        Choice rock = Choice.ROCK;
        Choice paper = Choice.PAPER;
        assertEquals("It's a Tie", gameService.determineResult(rock, rock));
        assertEquals("You Win", gameService.determineResult(paper, rock));
        assertEquals("Computer Wins", gameService.determineResult(rock, paper));
    }
}
