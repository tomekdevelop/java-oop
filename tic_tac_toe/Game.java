package tic_tac_toe;

public class Game {


    public void startGame() {

        char checkNumberBox;
        boolean result;

        BoardGame boardGame = new BoardGame();
        Draw draw = new Draw();
        Players p1 = new Players();
        Players p2 = new Players();

        char[][] table = boardGame.createBoard();
        String nameP1 = p1.addNamePlayer();
        p1.setName(nameP1);
        String nameP2 = p2.addNamePlayer();
        p2.setName(nameP2);
        draw.drawBoard(table);

        int countGame = 1;

        while (countGame < 10) {

            if (countGame % 2 == 0) {
                System.out.print(p1.getName());
                checkNumberBox = p1.readNumberBox();
                draw.drawSymbol(table, checkNumberBox, 'X');
                draw.drawBoard(table);
                result = boardGame.checkBoard(table, 'X');

                if (result) {
                    System.out.println("Wygral: " + p1.getName());
                    break;
                }
                countGame++;
            } else {
                System.out.println(p2.getName());
                checkNumberBox = p2.readNumberBox();
                draw.drawSymbol(table, checkNumberBox, 'O');
                draw.drawBoard(table);
                result = boardGame.checkBoard(table, 'O');
                if (result) {
                    System.out.println("Wygral: " + p2.getName());
                    break;
                }

                countGame++;

            }

            if (countGame == 9) {
                System.out.println("Remis!");
                break;
            }

        }

    }


}
