package application;

import battleship.BattleshipMatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BattleshipMatch match = new BattleshipMatch();
        Scanner sc = new Scanner(System.in);

        while(true){
            UI.clearScreen();
            UI.drawBoard(match);

            String oi = sc.nextLine();
        }
    }
}