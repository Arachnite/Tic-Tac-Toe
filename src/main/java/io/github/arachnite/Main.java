package io.github.arachnite;

import io.github.arachnite.logic.Board;
import io.github.arachnite.logic.Player;
import io.github.arachnite.logic.StartScreen;

public class Main {
    public static void main(String[] args) {
        Board[][] tictactoeBoard = new Board[3][3];
        Player player1 = new Player();
        Player player2 = new Player();
        StartScreen.printStartMessage(tictactoeBoard, player1, player2);
        if (!tictactoeBoard[0][0].isBoardUltimate() && player1.isSinglePlayer()) {
            Board.startSingleOrdinary(tictactoeBoard, player1, player2);

        } else if (tictactoeBoard[0][0].isBoardUltimate() && player1.isSinglePlayer()) {
            Board.startSingleUltimate(tictactoeBoard, player1, player2);

        } else if (!tictactoeBoard[0][0].isBoardUltimate() && !player1.isSinglePlayer()) {
            Board.startDoubleOrdinary(tictactoeBoard, player1, player2);

        } else if (tictactoeBoard[0][0].isBoardUltimate() && !player1.isSinglePlayer()) {
            Board.startDoubleUltimate(tictactoeBoard, player1, player2);
        }
    }
}