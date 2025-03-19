
package io.github.arachnite.logic;

import io.github.arachnite.util.GameState;
import io.github.arachnite.util.Constants.GlobalConstants;

public class GameController {

    public static void startGame() {
        StartScreen.executeStartMessage();
        if(GameObjects.player1.isFirst()) {
            GameObjects.gameState = GameState.PLAYER1TURN;
        } else {
            GameObjects.gameState = GameState.PLAYER2TURN;
        }
        initializeTurn();
    }

    public static void initializeTurn() {
        switch (GameObjects.gameState) {
            case PLAYER1TURN:
                GameFunctions.player1Turn();
                break;
            case POSTP1CHECK:
                GameFunctions.postP1Check();
                break;
            case PLAYER2TURN:
                GameFunctions.player2Turn();
                break;
            case POSTP2CHECK:
                GameFunctions.postP2Check();
                break;
        }
    }

    public static void endGame(Player player) {

        GlobalConstants.printf(player.getName() + " has won!");

    }

    public static void tieGame() {

        GlobalConstants.printf("Tie game!");

    }
}
