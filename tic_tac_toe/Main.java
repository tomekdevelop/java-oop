package tic_tac_toe;

public class Main {
    public static void main(String[] args) {
        BoardGame boardGame = new BoardGame();
        Draw draw = new Draw();
        Players gracz1 = new Players();




        char[][] table = boardGame.createBoard();
        draw.drawBoard(table);
      gracz1.checkBox();
//        draw.drawSymbol(table, '5', 'x');
//        draw.drawBoard(table);
//        draw.drawSymbol(table, '6', 'o');
//        draw.drawBoard(table);




    }
}
