
package io.github.arachnite.util;

import io.github.arachnite.logic.Board;

public class Constants {

    public static class GlobalConstants {

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
            for (int i = 0; i <= tictactoeBoard[0][0].getBoard().length - 1; i++) {
                GlobalConstants.printf("\n");
                for (int o = 0; o <= tictactoeBoard[0][0].getBoard()[i].length - 1; o++) {
                    GlobalConstants.printf("   " + tictactoeBoard[0][0].getBoard()[i][o]);
                }
            }
        }

        public static void printUltimateBoard() {

        }
    }
}