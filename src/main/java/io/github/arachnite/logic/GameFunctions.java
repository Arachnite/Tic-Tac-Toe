
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
                BoardConstants.printOrdinaryBoard();
                setOrdinaryPlace(GameObjects.player1);
                GameObjects.gameState = GameState.POSTP1CHECK;
                break;
            case CULTIMATE:

                break;
        }
    }

    public static void postP1Check() {
        switch (GameObjects.gameMode) {
            case PORDINARY:
                GameObjects.gameState = GameState.PLAYER2TURN;
                checkOrdinaryBoard(GameObjects.player1);
                GameController.initializeTurn();
                break;
            case PULTIMATE:

                break;
            case CORDINARY:
                GameObjects.gameState = GameState.PLAYER2TURN;
                checkOrdinaryBoard(GameObjects.player1);
                GameController.initializeTurn();
                break;
            case CULTIMATE:

                break;
        }
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
                computerOrdinaryTurn();
                GameObjects.gameState = GameState.POSTP2CHECK;
                break;
            case CULTIMATE:

                break;
        }
    }

    public static void postP2Check() {
        switch (GameObjects.gameMode) {
            case PORDINARY:
                GameObjects.gameState = GameState.PLAYER1TURN;
                checkOrdinaryBoard(GameObjects.player2);
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
                        continue;
                    }
                case "top middle":
                    if(GameObjects.gameBoard.getBoard()[0][1] == ' ') {
                        GameObjects.gameBoard.getBoard()[0][1] = player.getSymbol();
                        return;
                    } else {
                        GlobalConstants.printf(invalidMessage);
                        continue;
                    }
                case "top right":
                    if(GameObjects.gameBoard.getBoard()[0][2] == ' ') {
                        GameObjects.gameBoard.getBoard()[0][2] = player.getSymbol();
                        return;
                    } else {
                        GlobalConstants.printf(invalidMessage);
                        continue;
                    }
                case "middle left":
                    if(GameObjects.gameBoard.getBoard()[1][0] == ' ') {
                        GameObjects.gameBoard.getBoard()[1][0] = player.getSymbol();
                        return;
                    } else {
                        GlobalConstants.printf(invalidMessage);
                        continue;
                    }
                case "middle middle":
                    if(GameObjects.gameBoard.getBoard()[1][1] == ' ') {
                        GameObjects.gameBoard.getBoard()[1][1] = player.getSymbol();
                        return;
                    } else {
                        GlobalConstants.printf(invalidMessage);
                        continue;
                    }
                case "middle right":
                    if(GameObjects.gameBoard.getBoard()[1][2] == ' ') {
                        GameObjects.gameBoard.getBoard()[1][2] = player.getSymbol();
                        return;
                    } else {
                        GlobalConstants.printf(invalidMessage);
                        continue;
                    }
                case "bottom left":
                    if(GameObjects.gameBoard.getBoard()[2][0] == ' ') {
                        GameObjects.gameBoard.getBoard()[2][0] = player.getSymbol();
                        return;
                    } else {
                        GlobalConstants.printf(invalidMessage);
                        continue;
                    }
                case "bottom middle":
                    if(GameObjects.gameBoard.getBoard()[2][1] == ' ') {
                        GameObjects.gameBoard.getBoard()[2][1] = player.getSymbol();
                        return;
                    } else {
                        GlobalConstants.printf(invalidMessage);
                        continue;
                    }
                case "bottom right":
                    if(GameObjects.gameBoard.getBoard()[2][2] == ' ') {
                        GameObjects.gameBoard.getBoard()[2][2] = player.getSymbol();
                        return;
                    } else {
                        GlobalConstants.printf(invalidMessage);
                        continue;
                    }
                default:
                    GlobalConstants.printf(invalidMessage);
            }
        }
    }

    public static void checkOrdinaryBoard(Player player) {

        if (player.getSymbol() == GameObjects.gameBoard.getBoard()[0][0]) {

            if(player.getSymbol() == GameObjects.gameBoard.getBoard()[0][1] && player.getSymbol() == GameObjects.gameBoard.getBoard()[0][2]) {

                endGameFunction(player);

            } else if(player.getSymbol() == GameObjects.gameBoard.getBoard()[1][1] && player.getSymbol() == GameObjects.gameBoard.getBoard()[2][2]) {

                endGameFunction(player);

            } else if(player.getSymbol() == GameObjects.gameBoard.getBoard()[1][0] && player.getSymbol() == GameObjects.gameBoard.getBoard()[2][0]) {

                endGameFunction(player);

            }

        } else if(player.getSymbol() == GameObjects.gameBoard.getBoard()[0][1] && player.getSymbol() == GameObjects.gameBoard.getBoard()[1][1] && player.getSymbol() == GameObjects.gameBoard.getBoard()[2][1]) {

            endGameFunction(player);

        } else if(player.getSymbol() == GameObjects.gameBoard.getBoard()[0][2]) {

            if(player.getSymbol() == GameObjects.gameBoard.getBoard()[1][1] && player.getSymbol() == GameObjects.gameBoard.getBoard()[2][0]) {

                endGameFunction(player);

            } else if(player.getSymbol() == GameObjects.gameBoard.getBoard()[1][2] && player.getSymbol() == GameObjects.gameBoard.getBoard()[2][2]) {

                endGameFunction(player);

            }

        } else if(player.getSymbol() == GameObjects.gameBoard.getBoard()[1][0] && player.getSymbol() == GameObjects.gameBoard.getBoard()[1][1] && player.getSymbol() == GameObjects.gameBoard.getBoard()[1][2]) {

            endGameFunction(player);

        } else if(player.getSymbol() == GameObjects.gameBoard.getBoard()[2][0] && player.getSymbol() == GameObjects.gameBoard.getBoard()[2][1] && player.getSymbol() == GameObjects.gameBoard.getBoard()[2][2]) {

            endGameFunction(player);

        } else if(GameObjects.gameBoard.getBoard()[0][0] != ' ' && GameObjects.gameBoard.getBoard()[0][1] != ' ' && GameObjects.gameBoard.getBoard()[0][2] != ' ' && GameObjects.gameBoard.getBoard()[1][0] != ' ' && GameObjects.gameBoard.getBoard()[1][1] != ' ' && GameObjects.gameBoard.getBoard()[1][2] != ' ' && GameObjects.gameBoard.getBoard()[2][0] != ' ' && GameObjects.gameBoard.getBoard()[2][1] != ' ' && GameObjects.gameBoard.getBoard()[2][2] != ' ') {

            GameObjects.gameState = GameState.ENDGAME;
            BoardConstants.printOrdinaryBoard();
            GameController.tieGame();

        }
    }

    public static void endGameFunction(Player player) {

        GameObjects.gameState = GameState.ENDGAME;
        BoardConstants.printOrdinaryBoard();
        GameController.endGame(player);

    }

    public static void computerOrdinaryTurn() {
        if(!GameObjects.player1.isFirst()) {
            GameObjects.gameBoard.getBoard()[1][1] = GameObjects.player2.getSymbol();
        }
    }
}
