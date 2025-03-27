
package io.github.arachnite.util;

import io.github.arachnite.logic.GameObjects;

public class Constants {

    public static class GlobalConstants {

        public static void printf(String x) {

            System.out.print(x);

        }

    }

    public static class StartScreenConstants {

        public static final String[] startMessage = {
                ("\nWelcome to Tic Tac Toe!\n"),
                ("Please select 1 or 2 for all questions\n\n"),
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

        public static void printOrdinaryBoard() {
            GlobalConstants.printf("\n");
            for(int i = 0; i < 3; i++) {
                for(int ii = 0; ii < 3; ii++) {
                    GlobalConstants.printf("   " + GameObjects.gameBoard.getBoard()[i][ii] + "   ");
                    if(ii != 2) {
                        GlobalConstants.printf("|");
                    }
                }
                GlobalConstants.printf("\n");
                if(i != 2) {
                    GlobalConstants.printf("-----------------------\n");
                }
            }

            GlobalConstants.printf("\n" + GameObjects.player1.getName() + ": " + GameObjects.player1.getSymbol() + "       " + GameObjects.player2.getName() + ": " + GameObjects.player2.getSymbol() + "\n\n");
        }

        public static void printOrdinaryNumbers() {
            int count;
            GlobalConstants.printf("\n");
            for(int i = 0; i < 3; i++) {
                for(int ii = 1; ii <= 3; ii++) {
                    count = i * 3 + ii;
                    GlobalConstants.printf("   " + count + "   ");
                    if(ii != 3) {
                        GlobalConstants.printf("|");
                    }
                }
                GlobalConstants.printf("\n");
                if(i != 2) {
                    GlobalConstants.printf("-----------------------\n");
                }
            }

            GlobalConstants.printf("\n");
        }

        public static void printUltimateBoard() {
            GlobalConstants.printf("\n                         |                           |                         ");
            for(int r = 0; r < 3; r++) {
                for(int i = 0; i <3; i++) {
                    for (int c = 0; c < 3; c++) {
                        for (int ii = 0; ii < 3; ii++) {
                            GlobalConstants.printf("   " + GameObjects.gameBoard.getBoard()[r][c].getBoard()[i][ii] + "   ");
                            if (ii != 2) {
                                GlobalConstants.printf("|");
                            }
                        }
                        if (c != 2) {
                            GlobalConstants.printf("  |  ");
                        }
                    }
                    if (i != 2) {
                        GlobalConstants.printf("\n-----------------------  |  -----------------------  |  -----------------------\n");
                    }
                }
                if (r != 2) {
                    GlobalConstants.printf("\n                         |                           |                         \n-------------------------+---------------------------+-------------------------\n                         |                           |                         \n");
                }
            }
            GlobalConstants.printf("                         |                           |                         \n");

            GlobalConstants.printf("\n" + GameObjects.player1.getName() + ": " + GameObjects.player1.getSymbol() + "       " + GameObjects.player2.getName() + ": " + GameObjects.player2.getSymbol() + "\n\n");
        }

        public static void printUltimateNumbers() {
            int count;
            GlobalConstants.printf("\n");
        }
    }
}