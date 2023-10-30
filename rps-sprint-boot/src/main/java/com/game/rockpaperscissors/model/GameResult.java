package com.game.rockpaperscissors.model;

import lombok.Data;

@Data
public class GameResult {
    private String userChoice;
    private String computerChoice;
    private String result;
}

