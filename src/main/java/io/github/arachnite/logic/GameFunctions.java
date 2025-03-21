
package io.github.arachnite.logic;

import java.util.Scanner;

import io.github.arachnite.util.Constants.GlobalConstants;
import io.github.arachnite.util.Constants.BoardConstants;
import io.github.arachnite.util.GameState;

public class GameFunctions {

    public static void player1Turn() {

        switch (GameObjects.gameMode) {
            case PORDINARY, CORDINARY:
                BoardConstants.printOrdinaryBoard();
                setOrdinaryPlace(GameObjects.player1);
                GameObjects.gameState = GameState.POSTP1CHECK;
                GameController.initializeTurn();
                break;
            case PULTIMATE, CULTIMATE:

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

        GlobalConstants.printf(player.getName() + "'s turn. Select top, middle, or bottom and left, middle or right.\nex. Top Middle\n\n");

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
            BoardConstants.printOrdinaryBoard();
            GameController.tieGame();

        }
    }

    public static boolean endGameFunction(Player player) {

        GameObjects.gameState = GameState.ENDGAME;
        BoardConstants.printOrdinaryBoard();
        GameController.endGame(player);
        return false;

    }

    public static void computerOrdinaryTurn() {
        switch (GameObjects.computerTurn) {
            case 0:
                if(GameObjects.gameBoard.getBoard()[0][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 1;
                    break;

                } else if(GameObjects.gameBoard.getBoard()[0][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 2;
                    break;

                } else if(GameObjects.gameBoard.getBoard()[0][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 3;
                    break;

                } else if(GameObjects.gameBoard.getBoard()[1][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 4;
                    break;

                } else if(GameObjects.gameBoard.getBoard()[1][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 5;
                    break;

                } else if(GameObjects.gameBoard.getBoard()[1][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 6;
                    break;

                } else if(GameObjects.gameBoard.getBoard()[2][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 7;
                    break;

                } else if(GameObjects.gameBoard.getBoard()[2][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 8;
                    break;

                } else if(GameObjects.gameBoard.getBoard()[2][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 9;
                    break;

                }
            case 1:
                if(GameObjects.gameBoard.getBoard()[0][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 11;
                    break;

                } else if(GameObjects.gameBoard.getBoard()[0][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 12;
                    break;

                } else if(GameObjects.gameBoard.getBoard()[1][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 13;
                    break;

                } else if(GameObjects.gameBoard.getBoard()[1][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 14;
                    break;

                } else if(GameObjects.gameBoard.getBoard()[2][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 15;
                    break;

                } else if(GameObjects.gameBoard.getBoard()[2][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 16;
                    break;

                } else if(GameObjects.gameBoard.getBoard()[2][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 17;
                    break;

                }
            case 2:
                if(GameObjects.gameBoard.getBoard()[0][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 21;
                    break;

                } else if(GameObjects.gameBoard.getBoard()[0][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 22;
                    break;

                } else if(GameObjects.gameBoard.getBoard()[1][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 23;
                    break;

                } else if(GameObjects.gameBoard.getBoard()[1][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 24;
                    break;

                } else if(GameObjects.gameBoard.getBoard()[2][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 25;
                    break;

                } else if(GameObjects.gameBoard.getBoard()[2][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 26;
                    break;

                } else if(GameObjects.gameBoard.getBoard()[2][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 27;
                    break;

                }
            case 11:
                if(GameObjects.gameBoard.getBoard()[2][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 110;
                    break;

                }

            case 12:
                if(GameObjects.gameBoard.getBoard()[2][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 120;
                    break;

                }
            case 13:
                if(GameObjects.gameBoard.getBoard()[0][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 130;
                    break;

                }
            case 14:
                if(GameObjects.gameBoard.getBoard()[0][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 140;
                    break;

                }
            case 15:
                if(GameObjects.gameBoard.getBoard()[1][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 150;
                    break;

                }
            case 16:
                if(GameObjects.gameBoard.getBoard()[2][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 160;
                    break;

                }
            case 17:
                if(GameObjects.gameBoard.getBoard()[2][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 170;
                    break;

                }
            case 21:
                if(GameObjects.gameBoard.getBoard()[2][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 210;
                    break;

                }
            case 22:
                if(GameObjects.gameBoard.getBoard()[2][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 210;
                    break;

                }
            case 23:
                if(GameObjects.gameBoard.getBoard()[2][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 230;
                    break;

                }
            case 24:
                if(GameObjects.gameBoard.getBoard()[2][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 240;
                    break;

                }
            case 25:
                if(GameObjects.gameBoard.getBoard()[1][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 250;
                    break;

                }
            case 26:
                if(GameObjects.gameBoard.getBoard()[0][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 260;
                    break;

                }
            case 27:
                if(GameObjects.gameBoard.getBoard()[1][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 270;
                    break;

                }
            case 110, 120:
                if(GameObjects.gameBoard.getBoard()[1][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    break;

                }
            case 130, 150:
                if(GameObjects.gameBoard.getBoard()[2][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    break;

                }
            case 140:
                if(GameObjects.gameBoard.getBoard()[0][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    break;

                }
            case 160:
                if(GameObjects.gameBoard.getBoard()[1][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    break;

                }
            case 170:
                if(GameObjects.gameBoard.getBoard()[0][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    break;

                }
        }
//        if(!GameObjects.player1.isFirst()) {
//            GameObjects.gameBoard.getBoard()[1][1] = GameObjects.player2.getSymbol();
//        }
    }
}
