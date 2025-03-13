
package io.github.arachnite.logic;

import io.github.arachnite.util.GameState;

public class GameController {

    public static void startGame() {
        StartScreen.executeStartMessage(GameObjects.gameBoard, GameObjects.player1, GameObjects.player2);
        GameState gameState = GameState.PLAYER1TURN;
        while (true) {
            switch (gameState) {
                case PLAYER1TURN:
                    gameState = GameState.player1Turn();
                    break;
                case POSTP1CHECK:
                    gameState = GameState.postP1Check();
                    break;
                case PLAYER2TURN:
                    gameState = GameState.player2Turn();
                    break;
                case POSTP2CHECK:
                    gameState = GameState.postP2Check();
                    break;
            }
        }
    }
}
