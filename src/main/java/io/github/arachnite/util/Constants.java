
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
        }

        public static void printUltimateBoard() {

        }
    }
}