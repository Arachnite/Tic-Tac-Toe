
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

            singlePlayer = x;

        } else {

            singlePlayer = x;

        }
    }

    public void setPlayerName(String x) {

        name = x;

    }

    public void setSymbol(char x) {

        symbol = x;

    }

    public void setFirst(boolean x) {

        isFirst = x;

    }

    // Getters

    public boolean isFirst() {

        return isFirst;

    }

    public boolean isSinglePlayer() {

        return singlePlayer;

    }

    public String getName() {

        return name;

    }

    public char getSymbol() {

        return symbol;

    }
}
