package tic_tac_toe;

import java.util.Scanner;

public class Players {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char checkBox() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj nr pola: ");
        String numberBox = in.next();
        char checkBox = numberBox.charAt(0);

        return checkBox;
    }

}
