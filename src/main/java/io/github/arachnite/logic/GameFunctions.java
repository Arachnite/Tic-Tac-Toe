
package io.github.arachnite.logic;

import java.util.Scanner;

import io.github.arachnite.util.Constants.Console;
import io.github.arachnite.util.GameState;

public class GameFunctions {

    public static void player1Turn() {

        switch (GameObjects.gameMode) {
            case PORDINARY, CORDINARY:
                GameObjects.gameBoard.toString();
                setOrdinaryPlace(GameObjects.player1);
                GameObjects.gameState = GameState.POSTP1CHECK;
                GameController.initializeTurn();
                break;
            case PULTIMATE, CULTIMATE:
                //BoardConstants.printUltimateBoard();
                break;
        }
    }

    public static void postP1Check() {

        switch (GameObjects.gameMode) {
            case PORDINARY, CORDINARY:
                GameObjects.gameState = GameState.PLAYER2TURN;
                checkOrdinaryBoard(GameObjects.player1);
                GameController.initializeTurn();
                break;
            case PULTIMATE, CULTIMATE:

                break;
        }
    }

    public static void player2Turn() {

        switch (GameObjects.gameMode) {
            case PORDINARY:
                GameObjects.gameBoard.toString();
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
        Scanner sc = new Scanner(System.in);
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
            //BoardConstants.printOrdinaryBoard();
            GameController.tieGame();

        }
    }

    public static void endGameFunction(Player player) {

        GameObjects.gameState = GameState.ENDGAME;
        //BoardConstants.printOrdinaryBoard();
        GameController.endGame(player);

    }
}
