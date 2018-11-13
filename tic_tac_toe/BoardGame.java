package tic_tac_toe;

public class BoardGame {


    public char[][] createBoard() {

        char[][] emptyBoardChar = new char[3][3];
        char fieldNumber = '1';

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                emptyBoardChar[i][j] = fieldNumber++;
            }
        }
        return emptyBoardChar;
    }
}
