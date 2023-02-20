package application;

import battleship.BattleshipMatch;
import battleship.ship.Position;
import battleship.ship.Ship;

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
            System.out.print("What's the ship's size? (1, 2, 3) ");
            int size = sc.nextInt();
            System.out.print("X ");
            int x = sc.nextInt();
            System.out.print("Y ");
            int y = sc.nextInt();
            match.getCurrentBoard().addShip(new Ship(new Position(x, y), size, 0));
        }
    }
}