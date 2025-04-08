
package io.github.arachnite.logic;

import io.github.arachnite.util.Constants.Console;
import io.github.arachnite.util.Constants.Start;
import io.github.arachnite.util.Constants.sc;
import io.github.arachnite.util.GameMode;

public class StartScreen {

    public static void executeStartMessage() {

        executeFirstStartMessage();

        if (GameObjects.player1.isSinglePlayer()) {

            executeStartMessageOnePlayer();

        } else {

            executeStartMessageTwoPlayers();

        }

        GameObjects.gameBoard.printBoardNum();
    }

    public static void executeFirstStartMessage() {

        //Tic Tac Toe or Ultimate Tic Tac Toe Loop
        for (int i = 0; i <= 2; i++) {
            Console.print(Start.startMessage[i]);
        }
        Console.print(" ");

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
                Console.print("Invalid input. Please enter 1 or 2:  ");
            }
        }


        //Computer or Two Players Loop
        Console.print(Start.startMessage[3] + "             ");

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
                Console.print("Invalid input. Please enter 1 or 2:  ");
            }
        }
    }

    public static void executeStartMessageOnePlayer() {

        //Name Loop
        Console.print(Start.startMessage[4] + "                                ");
        GameObjects.player1.setPlayerName(sc.nextLine());
        GameObjects.player2.setPlayerName("Computer");

        //Symbol Loop
        Console.print(Start.startMessage[5] + "                              ");

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
                Console.print("Invalid input. Please enter X or O:  ");
            }
        }

        //Turn Order Loop
        Console.print(Start.startMessage[6] + GameObjects.player1.getName() + Start.startMessage[7] + " ");

        while(true) {
            String input = sc.nextLine().trim();

            if (input.equals("1") || input.equalsIgnoreCase(GameObjects.player1.getName())) {
                GameObjects.player1.setFirst(true);
                break;

            } else if (input.equals("2") || input.equalsIgnoreCase("computer")) {
                GameObjects.player1.setFirst(false);
                break;

            } else {
                Console.print("Invalid input. Please enter " + GameObjects.player1.getName() + " or computer: ");
            }
        }
    }

    public static void executeStartMessageTwoPlayers() {

        //Name Loop
        Console.print(Start.startMessage[8] + "               ");
        GameObjects.player1.setPlayerName(sc.nextLine());
        Console.print(Start.startMessage[9] + "              ");

        while(true) {
            String input = sc.nextLine().trim();

            if (input.equals(GameObjects.player1.getName())) {
                Console.print("Please enter a different name:       ");

            } else {
                GameObjects.player2.setPlayerName(input);
                break;
            }
        }


        //Symbol Loop
        Console.print(Start.startMessage[10] + "              ");

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
                Console.print("Invalid input. Please enter X or O:  ");
            }
        }


        //Turn Order Loop
        Console.print(Start.startMessage[11] + GameObjects.player1.getName() + " or " + GameObjects.player2.getName() + "? ");

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
                Console.print("Invalid input. Please enter " + GameObjects.player1.getName() + " or " + GameObjects.player2.getName() + ":");
            }
        }
    }
}