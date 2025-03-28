
package io.github.arachnite.logic;

import io.github.arachnite.util.Constants.GlobalConstants;
import io.github.arachnite.util.Constants.StartScreenConstants;
import io.github.arachnite.util.Constants.BoardConstants;
import io.github.arachnite.util.GameMode;

import java.util.Scanner;

public class StartScreen {

    public static void executeStartMessage() {

        executeFirstStartMessage();

        if (GameObjects.player1.isSinglePlayer()) {
            executeStartMessageOnePlayer();

        } else {
            executeStartMessageTwoPlayers();

        }

        GlobalConstants.printf("\nThese are the board positions!\n");
        if(GameObjects.gameMode == GameMode.PULTIMATE || GameObjects.gameMode == GameMode.CULTIMATE) {

        } else {

        }
        BoardConstants.printOrdinaryNumbers();
    }

    public static void executeFirstStartMessage() {

        Scanner sc = new Scanner(System.in);

        //Tic Tac Toe or Ultimate Tic Tac Toe Loop
        for (int i = 0; i <= 2; i++) {
            GlobalConstants.printf(StartScreenConstants.startMessage[i]);
        }
        GlobalConstants.printf(" ");

        while (true) {
            String input = sc.nextLine().trim();

            if (input.equals("1")) {
                GameObjects.gameBoard = new Board();
                GameObjects.gameMode = GameMode.ORDINARY;
                break;

            } else if (input.equals("2")) {
                GameObjects.gameBoard = new UltimateBoard();
                GameObjects.gameMode = GameMode.ULTIMATE;
                break;

            } else {
                GlobalConstants.printf("Invalid input. Please enter 1 or 2:  ");
            }
        }


        //Computer or Two Players Loop
        GlobalConstants.printf(StartScreenConstants.startMessage[3] + "             ");

        while (true) {
            String input = sc.nextLine().trim();

            if (input.equals("1")) {
                GameObjects.player1.setSinglePlayer(true);

                switch (GameObjects.gameMode) {
                    case ORDINARY:
                        GameObjects.gameMode = GameMode.CORDINARY;
                        break;
                    case ULTIMATE:
                        GameObjects.gameMode = GameMode.CULTIMATE;
                        break;
                }
                break;

            } else if (input.equals("2")) {
                GameObjects.player1.setSinglePlayer(false);

                switch (GameObjects.gameMode) {
                    case ORDINARY:
                        GameObjects.gameMode = GameMode.PORDINARY;
                        break;
                    case ULTIMATE:
                        GameObjects.gameMode = GameMode.PULTIMATE;
                        break;
                }
                break;

            } else {
                GlobalConstants.printf("Invalid input. Please enter 1 or 2:  ");
            }
        }
    }

    public static void executeStartMessageOnePlayer() {

        Scanner sc = new Scanner(System.in);

        //Name Loop
        GlobalConstants.printf(StartScreenConstants.startMessage[4] + "                                ");
        GameObjects.player1.setPlayerName(sc.nextLine());
        GameObjects.player2.setPlayerName("Computer");

        //Symbol Loop
        GlobalConstants.printf(StartScreenConstants.startMessage[5] + "                              ");

        while(true) {
            String input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("X")) {
                GameObjects.player1.setSymbol('X');
                GameObjects.player2.setSymbol('O');
                break;

            } else if (input.equalsIgnoreCase("O")) {
                GameObjects.player1.setSymbol('O');
                GameObjects.player2.setSymbol('X');
                break;
            } else {
                GlobalConstants.printf("Invalid input. Please enter X or O:  ");
            }
        }

        //Turn Order Loop
        GlobalConstants.printf(StartScreenConstants.startMessage[6] + GameObjects.player1.getName() + StartScreenConstants.startMessage[7] + " ");

        while(true) {
            String input = sc.nextLine().trim();

            if (input.equals("1") || input.equalsIgnoreCase(GameObjects.player1.getName())) {
                GameObjects.player1.setFirst(true);
                break;

            } else if (input.equals("2") || input.equalsIgnoreCase("computer")) {
                GameObjects.player1.setFirst(false);
                break;

            } else {
                GlobalConstants.printf("Invalid input. Please enter " + GameObjects.player1.getName() + " or computer: ");
            }
        }
    }

    public static void executeStartMessageTwoPlayers() {

        Scanner sc = new Scanner(System.in);

        //Name Loop
        GlobalConstants.printf(StartScreenConstants.startMessage[8] + "               ");
        GameObjects.player1.setPlayerName(sc.nextLine());
        GlobalConstants.printf(StartScreenConstants.startMessage[9] + "              ");

        while(true) {
            String input = sc.nextLine().trim();

            if (input.equals(GameObjects.player1.getName())) {
                GlobalConstants.printf("Please enter a different name:       ");

            } else {
                GameObjects.player2.setPlayerName(input);
                break;
            }
        }


        //Symbol Loop
        GlobalConstants.printf(StartScreenConstants.startMessage[10] + "              ");

        while(true) {
            String input = sc.nextLine().trim();

            if(input.equalsIgnoreCase("X")) {
                GameObjects.player1.setSymbol('X');
                GameObjects.player2.setSymbol('O');
                break;

            } else if (input.equalsIgnoreCase("O")) {
                GameObjects.player1.setSymbol('O');
                GameObjects.player2.setSymbol('X');
                break;

            } else {
                GlobalConstants.printf("Invalid input. Please enter X or O:  ");
            }
        }


        //Turn Order Loop
        GlobalConstants.printf(StartScreenConstants.startMessage[11] + GameObjects.player1.getName() + " or " + GameObjects.player2.getName() + "? ");

        while(true) {
            String input = sc.nextLine().trim();

            if (input.equals("1") || input.equalsIgnoreCase(GameObjects.player1.getName())) {
                GameObjects.player1.setFirst(true);
                GameObjects.player2.setFirst(false);
                break;

            } else if (input.equals("2") || input.equalsIgnoreCase(GameObjects.player2.getName())) {
                GameObjects.player1.setFirst(false);
                GameObjects.player2.setFirst(true);
                break;

            } else {
                GlobalConstants.printf("Invalid input. Please enter " + GameObjects.player1.getName() + " or " + GameObjects.player2.getName() + ":");
            }
        }
    }
}
