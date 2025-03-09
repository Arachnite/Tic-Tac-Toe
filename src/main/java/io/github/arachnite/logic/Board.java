
package io.github.arachnite.logic;

import io.github.arachnite.util.Constants.GlobalConstants;
import io.github.arachnite.util.Constants.BoardConstants;

public class Board {

    private String[][] board;

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

        board = new String[][] {
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}
        };

    }

    public void setBoardUltimate(boolean x) {

        this.isUltimate = x;

    }

    public boolean isBoardUltimate() {

        return this.isUltimate;

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


}
