package application;

import battleship.BattleshipMatch;
import battleship.ship.Position;
import battleship.ship.Ship;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BattleshipMatch match = new BattleshipMatch();
        Scanner sc = new Scanner(System.in);

        while(true){
            UI.clearScreen();
            System.out.println("Adding ships: ");
            UI.drawBoard(match);
            System.out.println("Waiting player " + match.getPlayer());
            System.out.print("X: ");
            int x = sc.nextInt();
            System.out.print("Y: ");
            int y = sc.nextInt();
        }
    }
}