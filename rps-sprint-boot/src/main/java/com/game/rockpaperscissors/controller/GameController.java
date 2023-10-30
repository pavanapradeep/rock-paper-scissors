package com.game.rockpaperscissors.controller;

import com.game.rockpaperscissors.model.GameResult;
import com.game.rockpaperscissors.model.UserChoice;
import com.game.rockpaperscissors.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/game")
public class GameController {
    @Autowired
    private GameService gameService;

    @PostMapping("/play")
    public GameResult playGame(@RequestBody UserChoice userChoice) {
        return gameService.playGame(userChoice.getChoice());
    }
}
