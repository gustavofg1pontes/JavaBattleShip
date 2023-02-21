package application;

import battleship.Board;
import ship.Ship;

public class UI {
    public static void drawBoard(Board board) {
        for (int i = 0; i < board.getBoard().length; i++) {
            System.out.print((10 - i) + ((10 - i == 10) ? " " : "  "));
            for (int j = 0; j < board.getBoard().length; j++) {
                printShip(board.getBoard()[i][j]);
            }
            System.out.println();
        }
        System.out.println("   a b c d e f g h i j");
    }

    public static void printShip(Ship s) {
        if (s != null) {
            System.out.print(s + " ");
        } else System.out.print("- ");
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
