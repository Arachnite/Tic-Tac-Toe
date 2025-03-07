
package io.github.arachnite.logic;

public class Player {

    private String name;
    private boolean singlePlayer;
    private boolean isFirst;
    private char symbol;

    public Player() {
        //Empty Constructor
    }

    public void setSinglePlayer(boolean x) {
        if(x) {
            this.singlePlayer = true;
        } else {
            this.singlePlayer = false;
        }
    }

    public boolean isSinglePlayer() {

        return this.singlePlayer;

    }

    public void setPlayerName(String x) {

        this.name = x;

    }

    public String getName() {

        return this.name;

    }

    public void setSymbol(char x) {

        this.symbol = x;

    }

    public char getSymbol() {

        return this.symbol;

    }

    public void isFirst(boolean x) {

        this.isFirst = x;

    }

    public boolean getOrder() {

        return this.isFirst;

    }

}
