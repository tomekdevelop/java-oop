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

    public boolean checkBoard(char[][] board, char symbol) {
            boolean result;

        if(board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol){
            result = true;
        }else if(board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol){
            result = true;
        }else if (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol){
            result = true;
        }else if (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol){
            result = true;
        }else if (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol){
            result = true;
        }else if (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol){
            result = true;
        }else if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol){
            result = true;
        }else if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
