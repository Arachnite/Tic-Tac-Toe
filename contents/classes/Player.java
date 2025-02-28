
package classes;

import utility.Constants.GlobalConstants;
import utility.Constants.StartScreenConstants;

public class Player {
    private char playerSymbol;
    private String name;
    private boolean isFirst;
    private boolean isSinglePlayer;

    public Player(boolean isSinglePlayer) {
        this.isSinglePlayer = isSinglePlayer;
    }
}