
package io.github.arachnite.logic;

import io.github.arachnite.util.Constants.BoardConstants;

public class GameFunctions {

    public static void player1Turn() {
        switch (GameObjects.gameMode) {
            case PORDINARY:
                BoardConstants.printOrdinaryBoard();
                break;
            case PULTIMATE:

                break;
            case CORDINARY:

                break;
            case CULTIMATE:

                break;
        }
    }

}
