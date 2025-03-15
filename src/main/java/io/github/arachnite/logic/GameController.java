
package io.github.arachnite.logic;

import io.github.arachnite.util.Constants.BoardConstants;
import io.github.arachnite.util.GameState;

public class GameController {

    public static void startGame() {
        StartScreen.executeStartMessage();
        GameState gameState = GameState.PLAYER1TURN;
//        while (true) {
//            switch (gameState) {
//                case PLAYER1TURN:
//                    player1Turn(GameObjects.gameBoard, GameObjects.player1, GameObjects.player2);
//                    break;
//                case POSTP1CHECK:
//                    // .....
//                    break;
//                case PLAYER2TURN:
//                    // ....
//                    break;
//                case POSTP2CHECK:
//                    // ...
//                    break;
//                case COMPUTERTURN:
//                    // ..
//                    break;
//                case COMPUTERCHECK:
//                    // .
//                    break;
//            }
//        }
        BoardConstants.printOrdinaryBoard();
    }

    public static void player1Turn(Board gameBoard, Player player1, Player player2) {
        // ...
    }
}
