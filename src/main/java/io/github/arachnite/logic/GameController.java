package io.github.arachnite.logic;

import io.github.arachnite.util.GameState;

public class GameController {

    public static void startGame() {
        StartScreen.executeStartMessage(GameObjects.gameBoard, GameObjects.player1, GameObjects.player2);

    }
}
