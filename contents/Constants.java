
import java.util.Scanner;

public class Constants {

    public class GlobalConstants {

        public static Scanner sc = new Scanner(System.in);

        public static void printf(String x) {
            System.out.print(x);
        }

    }

    public class StartScreenConstants {

        public static String[] startMessage = new String[]{
                ("Welcome to Tic Tac Toe!\n"),
                ("Please select 1 or 2:"),
                ("2D Tic Tac Toe or Ordinary Tic Tac Toe"),
                ("Two Players or Single Player"),
                ("Name"),
                ("Symbol"),
                ("Who will go first, "),
                ("or computer"),
                ("Name of first person:"),
                ("Symbol of first person:"),
                ("Name of second person:"),
                ("Symbol of second person:"),
                ("Who will go first, ");
        };
    }
}