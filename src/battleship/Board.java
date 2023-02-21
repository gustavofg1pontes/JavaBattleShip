package battleship;

import battleship.ship.Ship;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Board {
    private Ship[][] board;
    private List<Ship> shipsOnTheBoard = new ArrayList<>();
    private List<Ship> shipsOffTheBoard = new ArrayList<>();
    private List<Ship> shipsToAdd = new ArrayList<>();

    public List<Ship> initializeShipsToAdd(){
        shipsToAdd.add(new Ship(1));
        shipsToAdd.add(new Ship(1));
        shipsToAdd.add(new Ship(1));
        shipsToAdd.add(new Ship(1));
        shipsToAdd.add(new Ship(1));
        shipsToAdd.add(new Ship(2));
        shipsToAdd.add(new Ship(2));
        shipsToAdd.add(new Ship(2));
        shipsToAdd.add(new Ship(3));
        shipsToAdd.add(new Ship(3));
        return shipsToAdd;
    }

    public Board() {
        this.board = new Ship[10][10];
    }

    public void addShip(List<Ship> ships, Scanner sc) {
        for(Ship s : ships){
            System.out.println("Insira o x: ");
            s.getPosition().setX(sc.nextInt());
            System.out.println("Insira o y: ");
            s.getPosition().setY(sc.nextInt());
            board[s.getPosition().getX()][s.getPosition().getY()] = s;
            shipsOnTheBoard.add(s);
            ships.remove(s);
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
