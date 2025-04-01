
package io.github.arachnite.util;

import java.util.Scanner;

public class Constants {

    public static class Console {

        public static void print(String x) {

            System.out.print(x);

        }

    }

    public static class Start {

        public static final String[] startMessage = {
                ("\nWelcome to Tic Tac Toe!\n"),
                ("Please select 1 or 2 for all questions\n\n"),
                ("Tic Tac Toe or Ultimate Tic Tac Toe:"),
                ("Computer or Two Players:"),
                ("Name:"),
                ("Symbol:"),
                ("Who will go first, "),
                (" or computer?"),
                ("Name for first person:"),
                ("Name for second person:"),
                ("Symbol of first person:"),
                ("Who will go first, ")
        };
    }

    public static class sc {
        private static final Scanner scanner = new Scanner(System.in);

        public static String nextLine() {
            return scanner.nextLine();
        }

        public static void close() {
            scanner.close();
        }
    }
}