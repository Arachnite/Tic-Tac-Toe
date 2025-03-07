
package io.github.arachnite.util;

import java.util.Scanner;

public class Constants {

    private Constants() {
        throw new IllegalStateException("Constants");
    }

    public static class GlobalConstants {

        private GlobalConstants() {
            throw new IllegalStateException("Global Constants");
        }

        public static final Scanner sc = new Scanner(System.in);

        public static void printf(String x) {
            System.out.print(x);
        }

    }

    public static class StartScreenConstants {

        private StartScreenConstants() {
            throw new IllegalStateException("StartScreen Constants");
        }

        public static final String[] startMessage = {
                ("\nWelcome to Tic Tac Toe!"),
                ("Please select 1 or 2 for all questions"),
                ("Tic Tac Toe or Ultimate Tic Tac Toe:"),
                ("Computer or Two Players:"),
                ("Name:"),
                ("Symbol:"),
                ("Who will go first, "),
                (" or computer?"),
                ("Name of first person:"),
                ("Name of second person:"),
                ("Symbol of first person:"),
                ("Who will go first, ")
        };
    }
}