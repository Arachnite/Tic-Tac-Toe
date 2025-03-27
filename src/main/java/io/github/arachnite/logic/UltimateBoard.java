
package io.github.arachnite.logic;

public class UltimateBoard extends Board {

    private Board[][] ultimateBoard;

    /*  Ultimate Tic-Tac-Toe Board Visualization:

                                 |                           |
           X   |   O   |   X     |         |       |         |         |       |
        -----------------------  |  -----------------------  |  -----------------------
               |       |         |         |       |         |         |       |
        -----------------------  |  -----------------------  |  -----------------------
               |       |         |         |       |         |         |       |
                                 |                           |
        -------------------------+---------------------------+-------------------------
                                 |                           |
               |       |         |         |       |         |         |       |
        -----------------------  |  -----------------------  |  -----------------------
               |       |         |         |       |         |         |       |
        -----------------------  |  -----------------------  |  -----------------------
               |       |         |         |       |         |         |       |
                                 |                           |
        -------------------------+---------------------------+-------------------------
                                 |                           |
               |       |         |         |       |         |         |       |
        -----------------------  |  -----------------------  |  -----------------------
               |       |         |         |       |         |         |       |
        -----------------------  |  -----------------------  |  -----------------------
               |       |         |         |       |         |         |       |
                                 |                           |

     */

    // Constructors
    public UltimateBoard() {

        ultimateBoard = new Board[3][3];

    }

    // Getters
    public Board[][] getUltimateBoard() {

        return ultimateBoard;

    }
}
