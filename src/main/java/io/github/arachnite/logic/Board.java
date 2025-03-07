
package io.github.arachnite.logic;

public class Board {

    private char[][] board;

    private Player player1;
    private Player player2;

    private boolean singlePlayer;

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

//    public void set(int x, char y) {
//        if(isSinglePlayer) {
//
//        }
//    }



}
