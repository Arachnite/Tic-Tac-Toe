
package classes;

import utility.Constants.GlobalConstants;
import utility.Constants.StartScreenConstants;

public class TicTacToe {

    private char[][] board;

    private String player1;
    private String player2;

    /*  3D Tic-Tac-Toe Board Visualization:

                |            |
         1      |     2      |     3
                |            |
    --------------------------------------
                |            |
         4      |     5      |     6
                |            |
    --------------------------------------
                |            |
         7      |     8      |     9
                |            |

     */

     public TicTacToe (boolean x) {
       board = new char[][] {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
       };
     }

     public TicTacToe (String x) {
       board = new char[][] {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
       };
     }

}