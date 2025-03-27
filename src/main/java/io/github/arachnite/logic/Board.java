
package io.github.arachnite.logic;

import io.github.arachnite.util.Constants;

public class Board {

    private char[][] board;

    /*  Ordinary Tic-Tac-Toe Board Visualization:

           X   |   O   |   X
        -----------------------
           O   |   X   |   O
        -----------------------
           X   |   O   |   X

     */

    // Constructor
    public Board () {

        board = new char[][] {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

    }

    //Getters
    public char[][] getBoard() {

        return board;

    }

    public String toString() {
        StringBuilder returnString = new StringBuilder("\n");
        for(int i = 0; i < 3; i++) {
            for(int ii = 0; ii < 3; ii++) {
                returnString.append("   ").append(board[i][ii]).append("   ");
                if (ii != 2) {
                    returnString.append("|");
                }
            }
            returnString.append("\n");
            if (i != 2) {
                returnString.append("\n-----------------------\n");
            }
        }
        returnString.append("\n").append(GameObjects.player1.getName()).append(": ").append(GameObjects.player1.getSymbol()).append("       ").append(GameObjects.player2.getName()).append(": ").append(GameObjects.player2.getSymbol()).append("\n\n");

        return returnString.toString();
    }
}
