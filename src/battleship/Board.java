package battleship;

import battleship.ship.Ship;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private Ship[][] board;
    private List<Ship> shipsOnTheBoard = new ArrayList<>();
    private List<Ship> shipsOffTheBoard = new ArrayList<>();

    public Board() {
        this.board = new Ship[8][8];
    }

    public void addShip(Ship ship) {
        board[ship.getPosition().getX()][ship.getPosition().getY()] = ship;
        shipsOnTheBoard.add(ship);
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
