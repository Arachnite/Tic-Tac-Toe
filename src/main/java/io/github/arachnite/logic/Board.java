
package io.github.arachnite.logic;

public class Board {

    private char[][] board;

    private Player player1;
    private Player player2;

    private boolean isUltimate;

    /*  Ultimate Tic-Tac-Toe Board Visualization:

                |            |
         1      |     2      |     3              1 =         |      |
                |            |                          --------------------
    --------------------------------------                    |      |
                |            |                          --------------------
         4      |     5      |     6                          |      |
                |            |
    --------------------------------------
                |            |
         7      |     8      |     9
                |            |

    Each Board:         |      |
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

        this.isUltimate = x;

    }

    public boolean isBoardUltimate() {

        return this.isUltimate;

    }

    public static void startSingleOrdinary(Board[][] tictactoeBoard, Player player1, Player player2) {

    }

    public static void startSingleUltimate(Board[][] tictactoeBoard, Player player1, Player player2) {

    }

    public static void startDoubleOrdinary(Board[][] tictactoeBoard, Player player1, Player player2) {

    }

    public static void startDoubleUltimate(Board[][] tictactoeBoard, Player player1, Player player2) {

    }


}
