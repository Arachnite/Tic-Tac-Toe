
package io.github.arachnite.logic;

public class Player {

    private String name;

    private char symbol;

    private boolean singlePlayer;
    private boolean isFirst;

    // Constructors
    public Player() {
        // Default constructor
    }

    // Setters
    public void setSinglePlayer(boolean x) {
        if(x) {
            singlePlayer = true;
        } else {
            singlePlayer = false;
        }
    }

    public void setPlayerName(String x) {

        name = x;

    }

    public void setSymbol(char x) {

        symbol = x;

    }

    public void isFirst(boolean x) {

        this.isFirst = x;

    }

    // Getters

    public boolean isSinglePlayer() {

        return singlePlayer;

    }



    public String getName() {

        return name;

    }



    public char getSymbol() {

        return symbol;

    }



    public boolean getOrder() {

        return this.isFirst;

    }

}
