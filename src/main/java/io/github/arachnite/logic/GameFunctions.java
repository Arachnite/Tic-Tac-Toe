
package io.github.arachnite.logic;

import java.util.Scanner;

import io.github.arachnite.util.Constants.GlobalConstants;
import io.github.arachnite.util.Constants.BoardConstants;

public class GameFunctions {

    public static void player1Turn() {

        try (Scanner sc = new Scanner(System.in)) {

            switch (GameObjects.gameMode) {
                case PORDINARY:
                    BoardConstants.printOrdinaryBoard();
                    GlobalConstants.printf(GameObjects.player1.getName() + "'s turn. Select top, middle, or bottom and left, middle or right.\n");
                    break;
                case PULTIMATE:

                    break;
                case CORDINARY:

                    break;
                case CULTIMATE:

                    break;
            }
        }
    }

    public static void player2Turn() {

        try (Scanner sc = new Scanner(System.in)) {

            switch (GameObjects.gameMode) {
                case PORDINARY:
                    BoardConstants.printOrdinaryBoard();
                    GlobalConstants.printf(GameObjects.player2.getName() + "'s turn. Select top, middle, or bottom and left, middle or right.\n");
                    
                    break;
                case PULTIMATE:

                    break;
                case CORDINARY:

                    break;
                case CULTIMATE:

                    break;
            }
        }
    }
}
