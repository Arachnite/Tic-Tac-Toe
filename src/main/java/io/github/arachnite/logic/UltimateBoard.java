
package io.github.arachnite.logic;

public class UltimateBoard extends Board {

    private Board[][] ultimateBoard;
    private boolean freeTurn;

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
        for (int i = 0; i < 3; i++) {
            for (int ii = 0; ii < 3; ii++) {
                ultimateBoard[i][ii] = new Board();
            }
        }
        freeTurn = true;

    }

    // Getters
    public String toString() {
        try {
        StringBuilder returnString = new StringBuilder("\n                         |                           |                         \n");
        for (int r = 0; r < 3; r++) {
            for (int i = 0; i < 3; i++) {
                for (int c = 0; c < 3; c++) {
                    for (int ii = 0; ii < 3; ii++) {
                        returnString.append("   ").append(ultimateBoard[r][c].getBoard()[i][ii]).append("   ");
                        if (ii != 2) {
                            returnString.append("|");
                        }
                    }
                    if (c != 2) {
                        returnString.append("  |  ");
                    }
                }
                if (i != 2) {
                    returnString.append("\n-----------------------  |  -----------------------  |  -----------------------\n");
                }
            }
            if (r != 2) {
                returnString.append("\n                         |                           |                         ");
                returnString.append("\n-------------------------+---------------------------+-------------------------");
                returnString.append("\n                         |                           |                         \n");
            }
        }
        returnString.append("\n                         |                           |                         \n");
        returnString.append("\n").append("                            ").append(GameObjects.player1.getName()).append(": ").append(GameObjects.player1.getSymbol()).append("       ");
        returnString.append(GameObjects.player2.getName()).append(": ").append(GameObjects.player2.getSymbol()).append("\n\n");

        return returnString.toString();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "";
        }
    }

    public boolean isFirstTurn() {

        return freeTurn;

    }

    public void printBoardNum() {

        super.printBoardNum();
    }

}