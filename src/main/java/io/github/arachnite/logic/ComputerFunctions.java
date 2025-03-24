
package io.github.arachnite.logic;

public class ComputerFunctions {

    public static void computerOrdinaryTurn() {
        switch (GameObjects.computerTurn) {
            case 0:
                if (GameObjects.gameBoard.getBoard()[0][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 1;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[0][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 2;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[0][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 3;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[1][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 4;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[1][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 5;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[1][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 6;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[2][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 7;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[2][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 8;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[2][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 9;
                    break;

                }
            case 1:
                if (GameObjects.gameBoard.getBoard()[0][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 11;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[0][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 12;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[1][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 13;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[1][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 14;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[2][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 15;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[2][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 16;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[2][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 17;
                    break;

                }
            case 2:
                if (GameObjects.gameBoard.getBoard()[0][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 21;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[0][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 22;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[1][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 23;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[1][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 24;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[2][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 25;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[2][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 26;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[2][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 27;
                    break;

                }
            case 3:
                if (GameObjects.gameBoard.getBoard()[0][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 31;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[0][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 32;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[1][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 33;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[1][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 34;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[2][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 35;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[2][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 36;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[2][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 37;
                    break;

                }
            case 4:
                if (GameObjects.gameBoard.getBoard()[0][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 41;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[0][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 42;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[0][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 43;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[1][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 44;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[2][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 45;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[2][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 46;
                    break;

                } else if (GameObjects.gameBoard.getBoard()[2][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 47;
                    break;

                }
            case 11:
                if (GameObjects.gameBoard.getBoard()[2][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 110;
                    break;

                }
            case 12:
                if (GameObjects.gameBoard.getBoard()[2][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 120;
                    break;

                }
            case 13:
                if (GameObjects.gameBoard.getBoard()[0][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 130;
                    break;

                }
            case 14:
                if (GameObjects.gameBoard.getBoard()[0][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 140;
                    break;

                }
            case 15:
                if (GameObjects.gameBoard.getBoard()[1][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 150;
                    break;

                }
            case 16:
                if (GameObjects.gameBoard.getBoard()[2][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 160;
                    break;

                }
            case 17:
                if (GameObjects.gameBoard.getBoard()[2][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 170;
                    break;

                }
            case 21:
                if (GameObjects.gameBoard.getBoard()[2][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 210;
                    break;

                }
            case 22:
                if (GameObjects.gameBoard.getBoard()[2][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 210;
                    break;

                }
            case 23:
                if (GameObjects.gameBoard.getBoard()[2][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 230;
                    break;

                }
            case 24:
                if (GameObjects.gameBoard.getBoard()[2][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 240;
                    break;

                }
            case 25:
                if (GameObjects.gameBoard.getBoard()[1][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 250;
                    break;

                }
            case 26:
                if (GameObjects.gameBoard.getBoard()[0][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 260;
                    break;

                }
            case 27:
                if (GameObjects.gameBoard.getBoard()[1][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 270;
                    break;

                }
            case 31:
                if (GameObjects.gameBoard.getBoard()[2][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 310;
                    break;

                }
            case 32:
                if (GameObjects.gameBoard.getBoard()[2][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 320;
                    break;

                }
            case 33:
                if (GameObjects.gameBoard.getBoard()[0][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 330;
                    break;

                }
            case 34:
                if (GameObjects.gameBoard.getBoard()[0][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 340;
                    break;

                }
            case 35:
                if (GameObjects.gameBoard.getBoard()[2][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 340;
                    break;

                }
            case 36:
                if (GameObjects.gameBoard.getBoard()[2][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 340;
                    break;

                }
            case 37:
                if (GameObjects.gameBoard.getBoard()[1][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 340;
                    break;

                }
            case 41:
                if (GameObjects.gameBoard.getBoard()[0][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 410;
                    break;

                }
            case 42:
                if (GameObjects.gameBoard.getBoard()[2][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 420;
                    break;

                }
            case 43:
                if (GameObjects.gameBoard.getBoard()[0][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 430;
                    break;

                }
            case 44:
                if (GameObjects.gameBoard.getBoard()[2][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 440;
                    break;

                }
            case 45:
                if (GameObjects.gameBoard.getBoard()[2][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 450;
                    break;

                }
            case 46:
                if (GameObjects.gameBoard.getBoard()[2][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 460;
                    break;

                }
            case 47:
                if (GameObjects.gameBoard.getBoard()[2][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 110;
                    break;

                }
            case 110, 120, 310:
                if (GameObjects.gameBoard.getBoard()[1][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    break;

                }
            case 130, 150, 330:
                if (GameObjects.gameBoard.getBoard()[2][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    break;

                }
            case 140:
                if (GameObjects.gameBoard.getBoard()[0][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    break;

                }
            case 160, 260:
                if (GameObjects.gameBoard.getBoard()[1][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    break;

                }
            case 170, 460, 470:
                if (GameObjects.gameBoard.getBoard()[0][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    break;

                }
            case 210, 320:
                if (GameObjects.gameBoard.getBoard()[1][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    break;

                }
            case 220:
                if (GameObjects.gameBoard.getBoard()[1][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    break;

                }
            case 230, 250, 420:
                if (GameObjects.gameBoard.getBoard()[2][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    break;

                }
            case 240, 270:
                if (GameObjects.gameBoard.getBoard()[2][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    break;

                }
            case 340, 410:
                if (GameObjects.gameBoard.getBoard()[2][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    break;

                }
            case 350:
                if (GameObjects.gameBoard.getBoard()[0][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    break;

                }
            case 360:
                if (GameObjects.gameBoard.getBoard()[1][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    break;

                }
            case 370, 430:
                if (GameObjects.gameBoard.getBoard()[2][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    break;

                }
            case 440:
                if (GameObjects.gameBoard.getBoard()[0][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    break;

                }
            case 450:
                if (GameObjects.gameBoard.getBoard()[0][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    break;

                } else {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    break;

                }
        }
    }
}
