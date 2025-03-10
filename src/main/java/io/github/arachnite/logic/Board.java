
package io.github.arachnite.logic;

import io.github.arachnite.util.Constants.GlobalConstants;
import io.github.arachnite.util.Constants.BoardConstants;

public class Board {

    private char[][] board;

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

    //Setters
    public void setBoardSlot(int i, int j, char val) {

        board[i][j] = val;

    }

    //Mutators

}
