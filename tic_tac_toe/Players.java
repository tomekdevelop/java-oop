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

    public char readNumberBox() {
        Scanner in = new Scanner(System.in);
        System.out.println(" podaj nr pola: ");
        String numberBox = in.next();
        char checkBox = numberBox.charAt(0);

        return checkBox;
    }
    public String addNamePlayer(){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String name = in.next();

        return name;
    }

}
