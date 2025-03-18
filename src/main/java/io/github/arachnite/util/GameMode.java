
package io.github.arachnite.util;

public enum GameMode {
    ORDINARY,
    ULTIMATE,
    PORDINARY,
    PULTIMATE,
    CORDINARY,
    CULTIMATE;

    public String toString() {
        switch (this) {
            case ORDINARY:
                return "Ordinary";
            case ULTIMATE:
                return "Ultimate";
            case PORDINARY:
                return "Player Ordinary";
            case PULTIMATE:
                return "Player Ultimate";
            case CORDINARY:
                return "Computer Ordinary";
            case CULTIMATE:
                return "Computer Ultimate";
            default:
                return "Unknown";
        }
    }
}



