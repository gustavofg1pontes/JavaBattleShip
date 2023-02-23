package battleship;

import application.UI;
import ship.Ship;
import ship.ShipPosition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Board {
    private Ship[][] board;
    private List<Ship> shipsOnTheBoard = new ArrayList<>();
    private List<Ship> shipsOffTheBoard = new ArrayList<>();

    public Board() {
        this.board = new Ship[10][10];
    }

    public void addShips(List<Ship> shipsToAdd, Scanner sc) {
        ShipPosition sp = new ShipPosition();
        for (Ship s : shipsToAdd) {
            UI.clearScreen();
            System.out.println("Adding ships: ");
            UI.drawBoard(this);
            do {
                System.out.print("Insira a posição (ex: c2, b4...): ");
                String pos = sc.nextLine();
                if (pos.length() == 2 && Character.isDigit(pos.charAt(1))) {
                    sp.setValues(s.getPosition(), pos.charAt(0), Integer.parseInt(pos.substring(1, 2)));
                    s.setPosition(sp.transformToPosition());

                } else if (pos.length() == 3 && Character.isDigit(pos.charAt(1)) && Character.isDigit(pos.charAt(2))) {
                    sp.setValues(s.getPosition(), pos.charAt(0), Integer.parseInt(pos.substring(1, 3)));
                    s.setPosition(sp.transformToPosition());
                }
            } while (!sp.isShipPositionValid());
            board[s.getPosition().getX()][s.getPosition().getY()] = s;
            shipsOnTheBoard.add(s);
        }
    }

    public Ship removeShip(Ship ship) {
        Ship s = board[ship.getPosition().getX()][ship.getPosition().getY()];
        board[ship.getPosition().getX()][ship.getPosition().getY()] = null;
        shipsOnTheBoard.remove(ship);
        shipsOffTheBoard.add(ship);
        return s;
    }

    public Ship[][] getBoard() {
        return board;
    }
}
