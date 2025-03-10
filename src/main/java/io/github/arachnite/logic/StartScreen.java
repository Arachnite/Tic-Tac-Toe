
package io.github.arachnite.logic;

import io.github.arachnite.util.Constants.GlobalConstants;
import io.github.arachnite.util.Constants.StartScreenConstants;

import java.util.Scanner;

public class StartScreen {

    public static void executeStartMessage(Board tictactoeBoard, Player player1, Player player2) {

        executeFirstStartMessage(tictactoeBoard, player1, player2);

        if (player1.isSinglePlayer()) {
            executeStartMessageOnePlayer(tictactoeBoard, player1, player2);

        } else {
            executeStartMessageTwoPlayers(tictactoeBoard, player1, player2);

        }
    }

    public static void executeFirstStartMessage(Board tictactoeBoard, Player player1, Player player2) {

        Scanner sc = new Scanner(System.in);

        //Tic Tac Toe or Ultimate Tic Tac Toe Loop
        for (int i = 0; i <= 2; i++) {
            GlobalConstants.printf(StartScreenConstants.startMessage[i] + "\n");
        }

        while (true) {
            String input = sc.nextLine();

            if (input.equals("1")) {
                tictactoeBoard = new Board();
                break;

            } else if (input.equals("2")) {
                tictactoeBoard = new UltimateBoard();
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
                player1.setSinglePlayer(true);
                break;

            } else if (input.equals("2")) {
                player1.setSinglePlayer(false);
                player2.setSinglePlayer(false);
                break;

            } else {
                GlobalConstants.printf("Invalid input. Please enter 1 or 2.\n");
            }
        }
        sc.close();
    }

    public static void executeStartMessageOnePlayer(Board tictactoeBoard, Player player1, Player player2) {

        Scanner sc = new Scanner(System.in);

        //Name Loop
        GlobalConstants.printf(StartScreenConstants.startMessage[4] + "\n");
        player1.setPlayerName(sc.nextLine());

        //Symbol Loop
        GlobalConstants.printf(StartScreenConstants.startMessage[5] + "\n");

        while(true) {
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("X") || input.equalsIgnoreCase("O")) {
                player1.setSymbol(input.charAt(0));
                break;

            } else {
                GlobalConstants.printf("Invalid input. Please enter X or O.\n");
            }
        }

        //Turn Order Loop
        GlobalConstants.printf(StartScreenConstants.startMessage[6] + player1.getName() + StartScreenConstants.startMessage[7]);

        while(true) {
            String input = sc.nextLine();

            if (input.equals("1") || input.equalsIgnoreCase("computer")) {
                player1.isFirst(true);
                break;

            } else if (input.equals("2") || input.equalsIgnoreCase(player1.getName())) {
                player1.isFirst(false);
                break;

            } else {
                GlobalConstants.printf("Invalid input. Please enter computer or " + player1.getName() + " .\n");
            }
        }
        sc.close();
    }

    public static void executeStartMessageTwoPlayers(Board tictactoeBoard, Player player1, Player player2) {

        Scanner sc = new Scanner(System.in);

        //Name Loop
        GlobalConstants.printf(StartScreenConstants.startMessage[8] + "\n");
        player1.setPlayerName(sc.nextLine());
        GlobalConstants.printf(StartScreenConstants.startMessage[9] + "\n");

        while(true) {
            String input = sc.nextLine();

            if (input.equals(player1.getName())) {
                GlobalConstants.printf("Invalid input. Please enter a different name.\n");

            } else {
                player2.setPlayerName(input);
                break;
            }
        }


        //Symbol Loop
        GlobalConstants.printf(StartScreenConstants.startMessage[10] + "\n");

        while(true) {
            String input = sc.nextLine();

            if(input.equalsIgnoreCase("X")) {
                player1.setSymbol('X');
                player2.setSymbol('O');
                break;

            } else if (input.equalsIgnoreCase("O")) {
                player1.setSymbol('O');
                player2.setSymbol('X');
                break;

            } else {
                GlobalConstants.printf("Invalid input. Please enter X or O.\n");
            }
        }


        //Turn Order Loop
        GlobalConstants.printf(StartScreenConstants.startMessage[11] + player1.getName() + " or " + player2.getName() + "?\n");

        while(true) {
            String input = sc.nextLine();

            if (input.equals("1") || input.equalsIgnoreCase(player1.getName())) {
                player1.isFirst(true);
                player2.isFirst(false);
                break;

            } else if (input.equals("2") || input.equalsIgnoreCase(player2.getName())) {
                player1.isFirst(false);
                player2.isFirst(true);
                break;

            } else {
                GlobalConstants.printf("Invalid input. Please enter a " + player1.getName() + " or " + player2.getName() + ".\n");
            }
        }
        sc.close();
    }
}
