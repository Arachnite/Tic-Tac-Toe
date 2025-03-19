
package io.github.arachnite.logic;

import java.util.Scanner;

import io.github.arachnite.util.Constants.GlobalConstants;
import io.github.arachnite.util.Constants.BoardConstants;
import io.github.arachnite.util.GameState;

public class GameFunctions {

    public static void player1Turn() {

        switch (GameObjects.gameMode) {
            case PORDINARY:
                BoardConstants.printOrdinaryBoard();
                setOrdinaryPlace(GameObjects.player1);
                GameObjects.gameState = GameState.POSTP1CHECK;
                GameController.initializeTurn();
                break;
            case PULTIMATE:

                break;
            case CORDINARY:

                break;
            case CULTIMATE:

                break;
        }

    }

    public static void postP1Check() {
        GameObjects.gameState = GameState.PLAYER2TURN;
        GameController.initializeTurn();
    }

    public static void player2Turn() {

        switch (GameObjects.gameMode) {
            case PORDINARY:
                BoardConstants.printOrdinaryBoard();
                setOrdinaryPlace(GameObjects.player2);
                GameObjects.gameState = GameState.POSTP2CHECK;
                GameController.initializeTurn();
                break;
            case PULTIMATE:

                break;
            case CORDINARY:

                break;
            case CULTIMATE:

                break;
        }
    }

    public static void postP2Check() {
        GameObjects.gameState = GameState.PLAYER1TURN;
        GameController.initializeTurn();
    }

    public static void setOrdinaryPlace(Player player) {
        Scanner sc = new Scanner(System.in);
        String invalidMessage = "Invalid input. Please enter a valid space.\n";

        GlobalConstants.printf(player.getName() + "'s turn. Select top, middle, or bottom and left, middle or right.\nTop Middle\n\n");

        while (true) {
            String input = sc.nextLine();

            switch (input.toLowerCase()) {
                case "top left":
                    if(GameObjects.gameBoard.getBoard()[0][0] == ' ') {
                        GameObjects.gameBoard.getBoard()[0][0] = player.getSymbol();
                        return;
                    } else {
                        GlobalConstants.printf(invalidMessage);
                        return;
                    }
                case "top middle":
                    if(GameObjects.gameBoard.getBoard()[0][1] == ' ') {
                        GameObjects.gameBoard.getBoard()[0][1] = player.getSymbol();
                        return;
                    } else {
                        GlobalConstants.printf(invalidMessage);
                        return;
                    }
                default:
                    GlobalConstants.printf(invalidMessage);
            }
        }
    }
}
