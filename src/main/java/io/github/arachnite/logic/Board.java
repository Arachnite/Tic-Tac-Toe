
package io.github.arachnite.logic;

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
                {' ', ' ', ' ' },
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

    }

    //Getters
    public char[][] getBoard() {

        return board;

    }
}
