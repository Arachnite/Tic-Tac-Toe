
package classes;

import utility.Constants.GlobalConstants;
import utility.Constants.StartScreenConstants;

public class StartScreen {

    public static void printStartMessage() {

        for(int i = 0; i < 3; i++) {
            GlobalConstants.printf(StartScreenConstants.startMessage[i] + "\n");
        }

        while(true) {
            String input = GlobalConstants.sc.nextLine();

            if(input.equals("1")) {
                public static TicTacToe tictactoeBoard = new TicTacToe(true);
                break;
            } else if(input.equals("2")) {
                public static TicTacToe[][] tictactoeBoard = new TicTacToe[][]{
                    {new TicTacToe("Hi"), new TicTacToe("Hi"), new TicTacToe("Hi")},
                    {new TicTacToe("Hi"), new TicTacToe("Hi"), new TicTacToe("Hi")},
                    {new TicTacToe("Hi"), new TicTacToe("Hi"), new TicTacToe("Hi")}
                }; 
                break;
            } else {
                GlobalConstants.printf("Invalid input. Please enter 1 or 2.\n");
            }
        }

        while(true) {
            String input = GlobalConstants.sc.nextLine();

            if(input.equals("1")) {
                Player player1 = new Player (false);
                break;
            } else if(input.equals("2")) {
                
                break;
            } else {
                GlobalConstants.printf("Invalid input. Please enter 1 or 2.\n");
            }
        }
    }


}