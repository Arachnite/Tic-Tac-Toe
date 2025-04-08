
package io.github.arachnite.logic;

public class ComputerFunctions {

    public static void computerOrdinaryTurn() {
        switch (GameObjects.computerTurn) {
            case 0:
                if (GameObjects.gameBoard.getBoard()[0][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 1;

                } else if (GameObjects.gameBoard.getBoard()[0][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 2;

                } else if (GameObjects.gameBoard.getBoard()[0][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 3;

                } else if (GameObjects.gameBoard.getBoard()[1][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 4;

                } else if (GameObjects.gameBoard.getBoard()[1][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 5;

                } else if (GameObjects.gameBoard.getBoard()[1][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 6;

                } else if (GameObjects.gameBoard.getBoard()[2][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 7;

                } else if (GameObjects.gameBoard.getBoard()[2][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 8;

                } else if (GameObjects.gameBoard.getBoard()[2][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 9;

                }
                break;
            case 1:
                if (GameObjects.gameBoard.getBoard()[0][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 11;

                } else if (GameObjects.gameBoard.getBoard()[0][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 12;

                } else if (GameObjects.gameBoard.getBoard()[1][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 13;

                } else if (GameObjects.gameBoard.getBoard()[1][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 14;

                } else if (GameObjects.gameBoard.getBoard()[2][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 15;

                } else if (GameObjects.gameBoard.getBoard()[2][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 16;

                } else if (GameObjects.gameBoard.getBoard()[2][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 17;

                }
                break;
            case 2:
                if (GameObjects.gameBoard.getBoard()[0][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 21;

                } else if (GameObjects.gameBoard.getBoard()[0][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 22;

                } else if (GameObjects.gameBoard.getBoard()[1][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 23;

                } else if (GameObjects.gameBoard.getBoard()[1][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 24;

                } else if (GameObjects.gameBoard.getBoard()[2][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 25;

                } else if (GameObjects.gameBoard.getBoard()[2][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 26;

                } else if (GameObjects.gameBoard.getBoard()[2][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 27;

                }
                break;
            case 3:
                if (GameObjects.gameBoard.getBoard()[0][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 31;

                } else if (GameObjects.gameBoard.getBoard()[0][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 32;

                } else if (GameObjects.gameBoard.getBoard()[1][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 33;

                } else if (GameObjects.gameBoard.getBoard()[1][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 34;

                } else if (GameObjects.gameBoard.getBoard()[2][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 35;

                } else if (GameObjects.gameBoard.getBoard()[2][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 36;

                } else if (GameObjects.gameBoard.getBoard()[2][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 37;

                }
                break;
            case 4:
                if (GameObjects.gameBoard.getBoard()[0][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 41;

                } else if (GameObjects.gameBoard.getBoard()[0][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 42;

                } else if (GameObjects.gameBoard.getBoard()[0][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 43;

                } else if (GameObjects.gameBoard.getBoard()[1][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 44;

                } else if (GameObjects.gameBoard.getBoard()[2][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 45;

                } else if (GameObjects.gameBoard.getBoard()[2][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 46;

                } else if (GameObjects.gameBoard.getBoard()[2][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 47;

                }
            case 5:
                if (GameObjects.gameBoard.getBoard()[0][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 51;

                } else if (GameObjects.gameBoard.getBoard()[0][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 52;

                } else if (GameObjects.gameBoard.getBoard()[1][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 53;

                } else if (GameObjects.gameBoard.getBoard()[1][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 54;

                } else if (GameObjects.gameBoard.getBoard()[2][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 55;

                } else if (GameObjects.gameBoard.getBoard()[2][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 56;

                } else if (GameObjects.gameBoard.getBoard()[2][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 57;

                }
                break;
            case 6:
                if (GameObjects.gameBoard.getBoard()[0][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 61;

                } else if (GameObjects.gameBoard.getBoard()[0][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 62;

                } else if (GameObjects.gameBoard.getBoard()[0][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 63;

                } else if (GameObjects.gameBoard.getBoard()[1][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 64;

                } else if (GameObjects.gameBoard.getBoard()[2][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 65;

                } else if (GameObjects.gameBoard.getBoard()[2][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 66;

                } else if (GameObjects.gameBoard.getBoard()[2][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 67;

                }
                break;
            case 7:
                if (GameObjects.gameBoard.getBoard()[0][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 71;

                } else if (GameObjects.gameBoard.getBoard()[0][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 72;

                } else if (GameObjects.gameBoard.getBoard()[0][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 73;

                } else if (GameObjects.gameBoard.getBoard()[1][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 74;

                } else if (GameObjects.gameBoard.getBoard()[1][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 75;

                } else if (GameObjects.gameBoard.getBoard()[2][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 76;

                } else if (GameObjects.gameBoard.getBoard()[2][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 77;

                }
                break;
            case 8:
                if (GameObjects.gameBoard.getBoard()[0][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 81;

                } else if (GameObjects.gameBoard.getBoard()[0][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 82;

                } else if (GameObjects.gameBoard.getBoard()[0][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 83;

                } else if (GameObjects.gameBoard.getBoard()[1][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 84;

                } else if (GameObjects.gameBoard.getBoard()[1][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 85;

                } else if (GameObjects.gameBoard.getBoard()[2][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 86;

                } else if (GameObjects.gameBoard.getBoard()[2][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 87;

                }
                break;
            case 9:
                if (GameObjects.gameBoard.getBoard()[0][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 91;

                } else if (GameObjects.gameBoard.getBoard()[0][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 92;

                } else if (GameObjects.gameBoard.getBoard()[0][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 93;

                } else if (GameObjects.gameBoard.getBoard()[1][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 94;

                } else if (GameObjects.gameBoard.getBoard()[1][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 95;

                } else if (GameObjects.gameBoard.getBoard()[2][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 96;

                } else if (GameObjects.gameBoard.getBoard()[2][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 97;

                }
                break;
            case 11:
                if (GameObjects.gameBoard.getBoard()[2][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 110;

                }
                break;
            case 12:
                if (GameObjects.gameBoard.getBoard()[2][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 120;

                }
                break;
            case 13:
                if (GameObjects.gameBoard.getBoard()[0][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 130;

                }
                break;
            case 14:
                if (GameObjects.gameBoard.getBoard()[0][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 140;

                }
                break;
            case 15:
                if (GameObjects.gameBoard.getBoard()[1][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 150;

                }
                break;
            case 16:
                if (GameObjects.gameBoard.getBoard()[2][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 160;

                }
                break;
            case 17:
                if (GameObjects.gameBoard.getBoard()[2][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 170;

                }
                break;
            case 21:
                if (GameObjects.gameBoard.getBoard()[2][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 210;

                }
                break;
            case 22:
                if (GameObjects.gameBoard.getBoard()[2][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 210;

                }
                break;
            case 23:
                if (GameObjects.gameBoard.getBoard()[2][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 230;

                }
                break;
            case 24:
                if (GameObjects.gameBoard.getBoard()[2][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 240;

                }
                break;
            case 25:
                if (GameObjects.gameBoard.getBoard()[1][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 250;

                }
                break;
            case 26:
                if (GameObjects.gameBoard.getBoard()[0][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 260;

                }
                break;
            case 27:
                if (GameObjects.gameBoard.getBoard()[1][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 270;

                }
                break;
            case 31:
                if (GameObjects.gameBoard.getBoard()[2][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 310;

                }
                break;
            case 32:
                if (GameObjects.gameBoard.getBoard()[2][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 320;

                }
                break;
            case 33:
                if (GameObjects.gameBoard.getBoard()[0][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 330;

                }
                break;
            case 34:
                if (GameObjects.gameBoard.getBoard()[0][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 340;

                }
                break;
            case 35:
                if (GameObjects.gameBoard.getBoard()[2][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 340;

                }
                break;
            case 36:
                if (GameObjects.gameBoard.getBoard()[2][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 340;

                }
                break;
            case 37:
                if (GameObjects.gameBoard.getBoard()[1][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 340;

                }
                break;
            case 41:
                if (GameObjects.gameBoard.getBoard()[0][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 410;

                }
                break;
            case 42:
                if (GameObjects.gameBoard.getBoard()[2][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 420;

                }
                break;
            case 43:
                if (GameObjects.gameBoard.getBoard()[0][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 430;

                }
                break;
            case 44:
                if (GameObjects.gameBoard.getBoard()[2][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 440;

                }
                break;
            case 45:
                if (GameObjects.gameBoard.getBoard()[2][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 450;

                }
                break;
            case 46:
                if (GameObjects.gameBoard.getBoard()[2][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 460;

                }
                break;
            case 47:
                if (GameObjects.gameBoard.getBoard()[2][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 470;

                }
                break;
            case 51:
                if (GameObjects.gameBoard.getBoard()[0][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 511;

                } else if (GameObjects.gameBoard.getBoard()[1][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 512;

                } else if (GameObjects.gameBoard.getBoard()[1][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 513;

                } else if (GameObjects.gameBoard.getBoard()[2][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 514;

                } else if (GameObjects.gameBoard.getBoard()[2][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 515;

                }
                break;
            case 52:
                if (GameObjects.gameBoard.getBoard()[1][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 520;

                }
                break;
            case 53:
                if (GameObjects.gameBoard.getBoard()[0][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 531;

                } else if (GameObjects.gameBoard.getBoard()[0][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 532;

                } else if (GameObjects.gameBoard.getBoard()[2][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 533;

                } else if (GameObjects.gameBoard.getBoard()[2][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 534;

                } else if (GameObjects.gameBoard.getBoard()[2][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 535;

                }
                break;
            case 54:
                if (GameObjects.gameBoard.getBoard()[2][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 540;

                }
                break;
            case 55:
                if (GameObjects.gameBoard.getBoard()[0][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 550;

                }
                break;
            case 56:
                if (GameObjects.gameBoard.getBoard()[0][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 560;

                }
                break;
            case 57:
                if (GameObjects.gameBoard.getBoard()[0][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 570;

                }
                break;
            case 61:
                if (GameObjects.gameBoard.getBoard()[0][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 610;

                }
                break;
            case 62:
                if (GameObjects.gameBoard.getBoard()[2][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 620;

                }
                break;
            case 63:
                if (GameObjects.gameBoard.getBoard()[0][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 630;

                }
                break;
            case 64:
                if (GameObjects.gameBoard.getBoard()[2][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 640;

                }
                break;
            case 65:
                if (GameObjects.gameBoard.getBoard()[2][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 650;

                }
                break;
            case 66:
                if (GameObjects.gameBoard.getBoard()[0][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 660;

                }
                break;
            case 67:
                if (GameObjects.gameBoard.getBoard()[2][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 670;

                }
                break;
            case 71:
                if (GameObjects.gameBoard.getBoard()[2][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 710;

                }
                break;
            case 72:
                if (GameObjects.gameBoard.getBoard()[1][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 720;

                }
                break;
            case 73:
                if (GameObjects.gameBoard.getBoard()[2][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 730;

                }
                break;
            case 74:
                if (GameObjects.gameBoard.getBoard()[2][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 740;

                }
                break;
            case 75:
                if (GameObjects.gameBoard.getBoard()[0][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 750;

                }
                break;
            case 76:
                if (GameObjects.gameBoard.getBoard()[0][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 760;

                }
                break;
            case 77:
                if (GameObjects.gameBoard.getBoard()[0][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 770;

                }
                break;
            case 81:
                if (GameObjects.gameBoard.getBoard()[1][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 810;

                }
                break;
            case 82:
                if (GameObjects.gameBoard.getBoard()[0][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 820;

                }
                break;
            case 83:
                if (GameObjects.gameBoard.getBoard()[1][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 830;

                }
                break;
            case 84:
                if (GameObjects.gameBoard.getBoard()[2][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 840;

                }
                break;
            case 85:
                if (GameObjects.gameBoard.getBoard()[2][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 850;

                }
                break;
            case 86:
                if (GameObjects.gameBoard.getBoard()[0][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 860;

                }
                break;
            case 87:
                if (GameObjects.gameBoard.getBoard()[0][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 870;

                }
                break;
            case 91:
                if (GameObjects.gameBoard.getBoard()[2][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 910;

                }
                break;
            case 92:
                if (GameObjects.gameBoard.getBoard()[1][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 920;

                }
                break;
            case 93:
                if (GameObjects.gameBoard.getBoard()[1][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 930;

                }
                break;
            case 94:
                if (GameObjects.gameBoard.getBoard()[0][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 940;

                }
                break;
            case 95:
                if (GameObjects.gameBoard.getBoard()[2][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 950;

                }
                break;
            case 96:
                if (GameObjects.gameBoard.getBoard()[0][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 960;

                }
                break;
            case 97:
                if (GameObjects.gameBoard.getBoard()[0][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();
                    GameObjects.computerTurn = 970;

                }
                break;
            case 110, 120, 310:
                if (GameObjects.gameBoard.getBoard()[1][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();

                }
                break;
            case 130, 150, 330:
                if (GameObjects.gameBoard.getBoard()[2][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();

                }
                break;
            case 140, 533:
                if (GameObjects.gameBoard.getBoard()[0][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();

                }
                break;
            case 160, 260:
                if (GameObjects.gameBoard.getBoard()[1][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();

                }
                break;
            case 170, 460, 470, 840, 910, 940:
                if (GameObjects.gameBoard.getBoard()[0][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();

                }
                break;
            case 210, 320:
                if (GameObjects.gameBoard.getBoard()[1][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();

                }
                break;
            case 220:
                if (GameObjects.gameBoard.getBoard()[1][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();

                }
                break;
            case 230, 250, 420, 620:
                if (GameObjects.gameBoard.getBoard()[2][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();

                }
                break;
            case 240, 270, 640:
                if (GameObjects.gameBoard.getBoard()[2][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();

                }
                break;
            case 340, 410:
                if (GameObjects.gameBoard.getBoard()[2][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();

                }
                break;
            case 350, 650:
                if (GameObjects.gameBoard.getBoard()[0][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();

                }
                break;
            case 360:
                if (GameObjects.gameBoard.getBoard()[1][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();

                }
                break;
            case 370, 430:
                if (GameObjects.gameBoard.getBoard()[2][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();

                }
                break;
            case 440:
                if (GameObjects.gameBoard.getBoard()[0][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();

                }
                break;
            case 450:
                if (GameObjects.gameBoard.getBoard()[0][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();

                }
                break;
            case 511, 515:
                if (GameObjects.gameBoard.getBoard()[1][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();

                }
                break;
            case 512:
                if (GameObjects.gameBoard.getBoard()[0][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();

                } else if (GameObjects.gameBoard.getBoard()[2][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();

                }
                break;
            case 513:
                if (GameObjects.gameBoard.getBoard()[2][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();

                }
                break;
            case 514:
                if (GameObjects.gameBoard.getBoard()[1][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();

                } else if (GameObjects.gameBoard.getBoard()[1][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();

                }
                break;
            case 520, 532:
                if (GameObjects.gameBoard.getBoard()[0][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();

                } else if (GameObjects.gameBoard.getBoard()[2][1] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();

                }
                break;
            case 531:
                if (GameObjects.gameBoard.getBoard()[0][2] != ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();

                } else if (GameObjects.gameBoard.getBoard()[2][0] != ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();

                }
                break;
            case 534:
                if (GameObjects.gameBoard.getBoard()[0][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();

                }
                break;
            case 535:
                if (GameObjects.gameBoard.getBoard()[0][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();

                }
                break;
            case 610:
                if (GameObjects.gameBoard.getBoard()[2][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();

                }
                break;
            case 630:
                if (GameObjects.gameBoard.getBoard()[2][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();

                }
                break;
            case 660:
                if (GameObjects.gameBoard.getBoard()[0][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();

                }
                break;
            case 670:
                if (GameObjects.gameBoard.getBoard()[0][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();

                }
                break;
            case 710:
                if (GameObjects.gameBoard.getBoard()[0][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();

                }
                break;
            case 720:
                if (GameObjects.gameBoard.getBoard()[0][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();

                }
                break;
            case 730:
                if (GameObjects.gameBoard.getBoard()[0][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();

                }
                break;
            case 740:
                if (GameObjects.gameBoard.getBoard()[0][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();

                }
                break;
            case 750:
                if (GameObjects.gameBoard.getBoard()[2][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();

                }
                break;
            case 760:
                if (GameObjects.gameBoard.getBoard()[1][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();

                }
                break;
            case 770:
                if (GameObjects.gameBoard.getBoard()[1][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();

                }
                break;
            case 810:
                if (GameObjects.gameBoard.getBoard()[0][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();

                }
                break;
            case 820:
                if (GameObjects.gameBoard.getBoard()[2][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[2][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();

                }
                break;
            case 830:
                if (GameObjects.gameBoard.getBoard()[0][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();

                }
                break;
            case 850:
                if (GameObjects.gameBoard.getBoard()[0][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();

                }
                break;
            case 860:
                if (GameObjects.gameBoard.getBoard()[1][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();

                }
                break;
            case 870:
                if (GameObjects.gameBoard.getBoard()[1][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();

                }
                break;
            case 920:
                if (GameObjects.gameBoard.getBoard()[0][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();

                }
                break;
            case 930:
                if (GameObjects.gameBoard.getBoard()[0][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][0] = GameObjects.player2.getSymbol();

                }
                break;
            case 950:
                if (GameObjects.gameBoard.getBoard()[0][1] == ' ') {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();

                }
                break;
            case 960:
                if (GameObjects.gameBoard.getBoard()[1][2] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][2] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][2] = GameObjects.player2.getSymbol();

                }
                break;
            case 970:
                if (GameObjects.gameBoard.getBoard()[1][0] == ' ') {

                    GameObjects.gameBoard.getBoard()[1][0] = GameObjects.player2.getSymbol();

                } else {

                    GameObjects.gameBoard.getBoard()[0][1] = GameObjects.player2.getSymbol();

                }
                break;
        }
    }

    public static void computerUltimateTurn() {

    }
}