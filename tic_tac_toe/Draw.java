package tic_tac_toe;

public class Draw {

    public void drawBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(" " + board[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("=========");
    }

    public char[][] drawSymbol(char[][] tableGame, char fieldNumber, char symbol) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tableGame[i][j] == fieldNumber) {
                    tableGame[i][j] = symbol;
                }
            }
        }
        return tableGame;
    }
}
