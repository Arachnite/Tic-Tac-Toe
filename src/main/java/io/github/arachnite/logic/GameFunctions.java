
package io.github.arachnite.logic;

import io.github.arachnite.util.Constants.Console;
import io.github.arachnite.util.Constants.sc;
import io.github.arachnite.util.GameState;

public class GameFunctions {

    public static void player1Turn() {

        Console.print(GameObjects.gameBoard.toString());
        switch (GameObjects.gameMode) {
            case PORDINARY, CORDINARY:
                setOrdinaryPlace(GameObjects.player1);
                break;
            case PULTIMATE, CULTIMATE:
                setUltimatePlace(GameObjects.player1);
                break;
        }
        GameObjects.gameState = GameState.POSTP1CHECK;
        GameController.initializeTurn();
    }

    public static void postP1Check() {

        GameObjects.gameState = GameState.PLAYER2TURN;
        switch (GameObjects.gameMode) {
            case PORDINARY, CORDINARY:
                checkOrdinaryBoard(GameObjects.player1);
                break;
            case PULTIMATE, CULTIMATE:
                checkUltimateBoard(GameObjects.player1);
                break;
        }
        GameController.initializeTurn();
    }

    public static void player2Turn() {

        switch (GameObjects.gameMode) {
            case PORDINARY:
                Console.print(GameObjects.gameBoard.toString());
                setOrdinaryPlace(GameObjects.player2);
                GameObjects.gameState = GameState.POSTP2CHECK;
                GameController.initializeTurn();
                break;
            case PULTIMATE:

                break;
            case CORDINARY:
                ComputerFunctions.computerOrdinaryTurn();
                GameObjects.gameState = GameState.POSTP2CHECK;
                GameController.initializeTurn();
                break;
            case CULTIMATE:

                break;
        }
    }

    public static void postP2Check() {
        switch (GameObjects.gameMode) {
            case PORDINARY, CORDINARY:
                GameObjects.gameState = GameState.PLAYER1TURN;
                checkOrdinaryBoard(GameObjects.player2);
                GameController.initializeTurn();
                break;
            case PULTIMATE, CULTIMATE:

                break;
        }
    }

    public static void setOrdinaryPlace(Player player) {

        String invalidMessage = "Invalid input. Please enter a valid space.\n";
        Console.print(player.getName() + "'s turn. Select top, middle, or bottom and left, middle or right or an open number.\nex. Top Middle\n    1\n\n");

        while (true) {
            String input = sc.nextLine().trim().toLowerCase();

            switch (input) {
                case "top left", "left top", "1":
                    if(GameObjects.gameBoard.getBoard()[0][0] == ' ') {
                        GameObjects.gameBoard.getBoard()[0][0] = player.getSymbol();
                        return;
                    }
                    Console.print(invalidMessage);
                    break;
                case "top middle", "middle top", "2":
                    if(GameObjects.gameBoard.getBoard()[0][1] == ' ') {
                        GameObjects.gameBoard.getBoard()[0][1] = player.getSymbol();
                        return;
                    }
                    Console.print(invalidMessage);
                    break;
                case "top right", "right top", "3":
                    if(GameObjects.gameBoard.getBoard()[0][2] == ' ') {
                        GameObjects.gameBoard.getBoard()[0][2] = player.getSymbol();
                        return;
                    }
                    Console.print(invalidMessage);
                    break;
                case "middle left", "left middle", "4":
                    if(GameObjects.gameBoard.getBoard()[1][0] == ' ') {
                        GameObjects.gameBoard.getBoard()[1][0] = player.getSymbol();
                        return;
                    }
                    Console.print(invalidMessage);
                    break;
                case "middle middle", "5":
                    if(GameObjects.gameBoard.getBoard()[1][1] == ' ') {
                        GameObjects.gameBoard.getBoard()[1][1] = player.getSymbol();
                        return;
                    }
                    Console.print(invalidMessage);
                    break;
                case "middle right", "right middle", "6":
                    if(GameObjects.gameBoard.getBoard()[1][2] == ' ') {
                        GameObjects.gameBoard.getBoard()[1][2] = player.getSymbol();
                        return;
                    }
                    Console.print(invalidMessage);
                    break;
                case "bottom left", "left bottom", "7":
                    if(GameObjects.gameBoard.getBoard()[2][0] == ' ') {
                        GameObjects.gameBoard.getBoard()[2][0] = player.getSymbol();
                        return;
                    }
                    Console.print(invalidMessage);
                    break;
                case "bottom middle", "middle bottom", "8":
                    if(GameObjects.gameBoard.getBoard()[2][1] == ' ') {
                        GameObjects.gameBoard.getBoard()[2][1] = player.getSymbol();
                        return;
                    }
                    Console.print(invalidMessage);
                    break;
                case "bottom right", "right bottom", "9":
                    if(GameObjects.gameBoard.getBoard()[2][2] == ' ') {
                        GameObjects.gameBoard.getBoard()[2][2] = player.getSymbol();
                        return;
                    }
                    Console.print(invalidMessage);
                    break;
                default:
                    Console.print(invalidMessage);
            }
        }
    }

    public static void setUltimatePlace(Player player) {

        if(GameObjects.gameBoard.isFirstTurn()) {

        }

//        String invalidMessage = "Invalid input. Please enter a valid space.\n";
//        Console.print(player.getName() + "'s turn. Select top, middle, or bottom and left, middle or right or an open number.\nex. Top Middle\n    1\n\n");
//
//        while (true) {
//            String input = sc.nextLine().trim().toLowerCase();
//
//        }
    }

    public static void checkOrdinaryBoard(Player player) {

        if (player.getSymbol() == GameObjects.gameBoard.getBoard()[0][0]) {

            if(player.getSymbol() == GameObjects.gameBoard.getBoard()[0][1] && player.getSymbol() == GameObjects.gameBoard.getBoard()[0][2]) {

                endGameFunction(player);
                return;

            } else if(player.getSymbol() == GameObjects.gameBoard.getBoard()[1][1] && player.getSymbol() == GameObjects.gameBoard.getBoard()[2][2]) {

                endGameFunction(player);
                return;

            } else if(player.getSymbol() == GameObjects.gameBoard.getBoard()[1][0] && player.getSymbol() == GameObjects.gameBoard.getBoard()[2][0]) {

                endGameFunction(player);
                return;

            }

        }
        if(player.getSymbol() == GameObjects.gameBoard.getBoard()[0][1] && player.getSymbol() == GameObjects.gameBoard.getBoard()[1][1] && player.getSymbol() == GameObjects.gameBoard.getBoard()[2][1]) {

            endGameFunction(player);
            return;

        }
        if(player.getSymbol() == GameObjects.gameBoard.getBoard()[0][2]) {

            if(player.getSymbol() == GameObjects.gameBoard.getBoard()[1][1] && player.getSymbol() == GameObjects.gameBoard.getBoard()[2][0]) {

                endGameFunction(player);
                return;

            } else if(player.getSymbol() == GameObjects.gameBoard.getBoard()[1][2] && player.getSymbol() == GameObjects.gameBoard.getBoard()[2][2]) {

                endGameFunction(player);
                return;

            }

        }
        if(player.getSymbol() == GameObjects.gameBoard.getBoard()[1][0] && player.getSymbol() == GameObjects.gameBoard.getBoard()[1][1] && player.getSymbol() == GameObjects.gameBoard.getBoard()[1][2]) {

            endGameFunction(player);
            return;

        }
        if(player.getSymbol() == GameObjects.gameBoard.getBoard()[2][0] && player.getSymbol() == GameObjects.gameBoard.getBoard()[2][1] && player.getSymbol() == GameObjects.gameBoard.getBoard()[2][2]) {

            endGameFunction(player);
            return;

        }
        if(GameObjects.gameBoard.getBoard()[0][0] != ' ' && GameObjects.gameBoard.getBoard()[0][1] != ' ' && GameObjects.gameBoard.getBoard()[0][2] != ' ' && GameObjects.gameBoard.getBoard()[1][0] != ' ' && GameObjects.gameBoard.getBoard()[1][1] != ' ' && GameObjects.gameBoard.getBoard()[1][2] != ' ' && GameObjects.gameBoard.getBoard()[2][0] != ' ' && GameObjects.gameBoard.getBoard()[2][1] != ' ' && GameObjects.gameBoard.getBoard()[2][2] != ' ') {

            GameObjects.gameState = GameState.ENDGAME;
            Console.print(GameObjects.gameBoard.toString());
            GameController.tieGame();

        }
    }

    public static void checkUltimateBoard(Player player) {

    }

    public static void endGameFunction(Player player) {

        GameObjects.gameState = GameState.ENDGAME;
        Console.print(GameObjects.gameBoard.toString());
        GameController.endGame(player);

    }
}