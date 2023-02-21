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
        for (Ship s : shipsToAdd) {
            UI.clearScreen();
            System.out.println("Adding ships: ");
            UI.drawBoard(this);
            System.out.print("Insira a posição (ex: c2, b4...): ");
            String pos = sc.nextLine();
            if(pos.length() == 2){
                s.setPosition(ShipPosition.transformToPosition(pos.charAt(0), Integer.parseInt(pos.substring(1, 2))));
            }else s.setPosition(ShipPosition.transformToPosition(pos.charAt(0), Integer.parseInt(pos.substring(1, 3))));
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
