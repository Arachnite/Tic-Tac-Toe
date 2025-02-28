
package utility;

import java.util.Scanner;

public class Constants {

    public static class GlobalConstants {

        public static Scanner sc = new Scanner(System.in);

        public static void printf(String x) {
            System.out.print(x);
        }

    }

    public static class StartScreenConstants {

        public static String[] startMessage = {
                ("\nWelcome to Tic Tac Toe!"),
                ("Please select 1 or 2:"),
                ("Tic Tac Toe or Ultimate Tic Tac Toe"),
                ("Two Players or Computer"),
                ("Name"),
                ("Symbol"),
                ("Who will go first, "),
                ("or computer"),
                ("Name of first person:"),
                ("Symbol of first person:"),
                ("Name of second person:"),
                ("Symbol of second person:"),
                ("Who will go first, ")
        };
    }
}