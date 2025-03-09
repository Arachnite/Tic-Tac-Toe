
package io.github.arachnite.logic;

import io.github.arachnite.util.Constants.GlobalConstants;
import io.github.arachnite.util.Constants.BoardConstants;

public class Board {

    private char[][] board;

    private boolean isUltimate;

    /*  Ultimate Tic-Tac-Toe Board Visualization:

              |      |
        --------------------
              |      |
        --------------------
              |      |

        Ordinary Tic-Tac-Toe Board Visualization:

              |      |
        --------------------
              |      |
        --------------------
              |      |

     */

    public Board () {

        board = new char[][] {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

    }



    public void setBoardUltimate(boolean x) {

        isUltimate = x;

    }

    public boolean isBoardUltimate() {

        return isUltimate;

    }

    public static void startSingleOrdinary(Board[][] tictactoeBoard, Player player1) {

    }

    public static void startSingleUltimate(Board[][] tictactoeBoard, Player player1) {

    }

    public static void startDoubleOrdinary(Board[][] tictactoeBoard, Player player1, Player player2) {
        BoardConstants.printOrdinaryBoard(tictactoeBoard);
    }

    public static void startDoubleUltimate(Board[][] tictactoeBoard, Player player1, Player player2) {

    }


    public char[][] getBoard() {
        return board;
    }

    // setters

    public void setBoardSlot(int i, int j, char val) {
        board[i][j] = val;
    }

    //getters
}
