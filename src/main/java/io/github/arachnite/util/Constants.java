
package io.github.arachnite.util;

import java.util.Scanner;

import io.github.arachnite.logic.Board;

public class Constants {

    public static class GlobalConstants {

        private GlobalConstants() {
            throw new IllegalStateException("Global Constants");
        }

        public static final Scanner sc = new Scanner(System.in);

        public static void printf(String x) {

            System.out.print(x);

        }

    }

    public static class StartScreenConstants {

        public static final String[] startMessage = {
                ("\nWelcome to Tic Tac Toe!"),
                ("Please select 1 or 2 for all questions"),
                ("Tic Tac Toe or Ultimate Tic Tac Toe:"),
                ("Computer or Two Players:"),
                ("Name:"),
                ("Symbol:"),
                ("Who will go first, "),
                (" or computer?"),
                ("Name for first person:"),
                ("Name for second person:"),
                ("Symbol of first person:"),
                ("Who will go first, ")
        };
    }

    public static class BoardConstants {

        public static void printOrdinaryBoard(Board[][] tictactoeBoard) {
            for (int i = 0; i <= 2; i++) {
                GlobalConstants.printf("\n   " + tictactoeBoard[i][0] + "  |   " + tictactoeBoard[i][1] + "  |   " +tictactoeBoard[i][2] + "\n--------------------\n");
            }
        }

        public static void printUltimateBoard() {

        }
    }
}