
package io.github.arachnite.logic;

import io.github.arachnite.util.GameState;

public class GameController {

    public static void startGame() {
        StartScreen.executeStartMessage();
        GameObjects.gameState = GameState.PLAYER1TURN;
        initializeTurn();
        //GlobalConstants.printf(GameObjects.gameMode.toString());
    }

    public static void initializeTurn() {
        switch (GameObjects.gameState) {
            case PLAYER1TURN:
                GameFunctions.player1Turn();
                break;
            case POSTP1CHECK:

                break;
            case PLAYER2TURN:

                break;
            case POSTP2CHECK:

                break;
        }
    }


}
