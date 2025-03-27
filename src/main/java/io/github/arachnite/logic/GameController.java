
package io.github.arachnite.logic;

import io.github.arachnite.util.GameState;
import io.github.arachnite.util.Constants.GlobalConstants;

import java.util.Scanner;

public class GameController {

    public static void initiateGameData() {

        GameObjects.computerTurn = 0;
        GameObjects.player1 = new Player();
        GameObjects.player2 = new Player();
        StartScreen.executeStartMessage();
        startGame();

    }

    public static void startGame() {

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

        Scanner sc = new Scanner(System.in);

        GlobalConstants.printf("\n" + player.getName() + " has won!\nWant to play again? (Y/N)\n\n");
        String input = sc.nextLine();
        if(input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("Yes")) {

            GlobalConstants.printf("\nKeep the same settings? (Y/N)\n\n");
            input = sc.nextLine();

            if(input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("Yes")) {

                startGame();

            } else {

                initiateGameData();

            }
        }
    }

    public static void tieGame() {

        Scanner sc = new Scanner(System.in);

        GlobalConstants.printf("\nTie game!\nWant to play again? (Y/N)\n\n");
        String input = sc.nextLine();
        if(input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("Yes")) {

            GlobalConstants.printf("\nKeep the same settings? (Y/N)\n\n");
            input = sc.nextLine();

            if(input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("Yes")) {

                startGame();

            } else {

                initiateGameData();

            }
        }
    }
}
