
package io.github.arachnite.logic;

import io.github.arachnite.util.GameState;

public class GameController {

    public static void startGame() {
        StartScreen.executeStartMessage();
        if(GameObjects.player1.isFirst()) {
            GameObjects.gameState = GameState.PLAYER1TURN;
        } else {
            GameObjects.gameState = GameState.PLAYER2TURN;
        }
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
                GameFunctions.player2Turn();
                break;
            case POSTP2CHECK:

                break;
        }
    }


}
