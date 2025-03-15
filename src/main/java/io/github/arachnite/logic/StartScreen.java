
package io.github.arachnite.logic;

import io.github.arachnite.util.Constants.GlobalConstants;
import io.github.arachnite.util.Constants.StartScreenConstants;

import java.util.Scanner;

public class StartScreen {

    public static void executeStartMessage() {

        executeFirstStartMessage();

        if (GameObjects.player1.isSinglePlayer()) {
            executeStartMessageOnePlayer();

        } else {
            executeStartMessageTwoPlayers();

        }
    }

    public static void executeFirstStartMessage() {

        Scanner sc = new Scanner(System.in);

        //Tic Tac Toe or Ultimate Tic Tac Toe Loop
        for (int i = 0; i <= 2; i++) {
            GlobalConstants.printf(StartScreenConstants.startMessage[i] + "\n");
        }

        while (true) {
            String input = sc.nextLine();

            if (input.equals("1")) {
                GameObjects.gameBoard = new Board();
                break;

            } else if (input.equals("2")) {
                GameObjects.gameBoard = new UltimateBoard();
                break;

            } else {
                GlobalConstants.printf("Invalid input. Please enter 1 or 2.\n");
            }
        }


        //Computer or Two Players Loop
        GlobalConstants.printf(StartScreenConstants.startMessage[3] + "\n");

        while (true) {
            String input = sc.nextLine();

            if (input.equals("1")) {
                GameObjects.player1.setSinglePlayer(true);
                break;

            } else if (input.equals("2")) {
                GameObjects.player1.setSinglePlayer(false);
                GameObjects.player2.setSinglePlayer(false);
                break;

            } else {
                GlobalConstants.printf("Invalid input. Please enter 1 or 2.\n");
            }
        }
        sc.close();
    }

    public static void executeStartMessageOnePlayer() {

        Scanner sc = new Scanner(System.in);

        //Name Loop
        GlobalConstants.printf(StartScreenConstants.startMessage[4] + "\n");
        GameObjects.player1.setPlayerName(sc.nextLine());

        //Symbol Loop
        GlobalConstants.printf(StartScreenConstants.startMessage[5] + "\n");

        while(true) {
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("X") || input.equalsIgnoreCase("O")) {
                GameObjects.player1.setSymbol(input.charAt(0));
                break;

            } else {
                GlobalConstants.printf("Invalid input. Please enter X or O.\n");
            }
        }

        //Turn Order Loop
        GlobalConstants.printf(StartScreenConstants.startMessage[6] + GameObjects.player1.getName() + StartScreenConstants.startMessage[7]);

        while(true) {
            String input = sc.nextLine();

            if (input.equals("1") || input.equalsIgnoreCase("computer")) {
                GameObjects.player1.isFirst(true);
                break;

            } else if (input.equals("2") || input.equalsIgnoreCase(GameObjects.player1.getName())) {
                GameObjects.player1.isFirst(false);
                break;

            } else {
                GlobalConstants.printf("Invalid input. Please enter computer or " + GameObjects.player1.getName() + " .\n");
            }
        }
        sc.close();
    }

    public static void executeStartMessageTwoPlayers() {

        Scanner sc = new Scanner(System.in);

        //Name Loop
        GlobalConstants.printf(StartScreenConstants.startMessage[8] + "\n");
        GameObjects.player1.setPlayerName(sc.nextLine());
        GlobalConstants.printf(StartScreenConstants.startMessage[9] + "\n");

        while(true) {
            String input = sc.nextLine();

            if (input.equals(GameObjects.player1.getName())) {
                GlobalConstants.printf("Invalid input. Please enter a different name.\n");

            } else {
                GameObjects.player2.setPlayerName(input);
                break;
            }
        }


        //Symbol Loop
        GlobalConstants.printf(StartScreenConstants.startMessage[10] + "\n");

        while(true) {
            String input = sc.nextLine();

            if(input.equalsIgnoreCase("X")) {
                GameObjects.player1.setSymbol('X');
                GameObjects.player2.setSymbol('O');
                break;

            } else if (input.equalsIgnoreCase("O")) {
                GameObjects.player1.setSymbol('O');
                GameObjects.player2.setSymbol('X');
                break;

            } else {
                GlobalConstants.printf("Invalid input. Please enter X or O.\n");
            }
        }


        //Turn Order Loop
        GlobalConstants.printf(StartScreenConstants.startMessage[11] + GameObjects.player1.getName() + " or " + GameObjects.player2.getName() + "?\n");

        while(true) {
            String input = sc.nextLine();

            if (input.equals("1") || input.equalsIgnoreCase(GameObjects.player1.getName())) {
                GameObjects.player1.isFirst(true);
                GameObjects.player2.isFirst(false);
                break;

            } else if (input.equals("2") || input.equalsIgnoreCase(GameObjects.player2.getName())) {
                GameObjects.player1.isFirst(false);
                GameObjects.player2.isFirst(true);
                break;

            } else {
                GlobalConstants.printf("Invalid input. Please enter a " + GameObjects.player1.getName() + " or " + GameObjects.player2.getName() + ".\n");
            }
        }
        sc.close();
    }
}
