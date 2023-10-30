package com.game.rockpaperscissors.service;

import com.game.rockpaperscissors.model.Choice;
import com.game.rockpaperscissors.model.GameResult;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class GameService {
    public GameResult playGame(Choice userChoice) {
        Choice[] options = Choice.values();
        Random random = new Random();
        Choice computerChoice = options[random.nextInt(options.length)];

        String result = determineResult(userChoice, computerChoice);

        GameResult gameResult = new GameResult();
        gameResult.setUserChoice(userChoice.toString());
        gameResult.setComputerChoice(computerChoice.toString());
        gameResult.setResult(result);
        return gameResult;
    }

    protected String determineResult(Choice userChoice, Choice computerChoice) {
        if (userChoice == computerChoice) {
            return "It's a Tie";
        } else if ((userChoice == Choice.ROCK && computerChoice == Choice.SCISSORS) ||
                   (userChoice == Choice.PAPER && computerChoice == Choice.ROCK) ||
                   (userChoice == Choice.SCISSORS && computerChoice == Choice.PAPER)) {
            return "You Win";
        } else {
            return "Computer Wins";
        }
    }
}
