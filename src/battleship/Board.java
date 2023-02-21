package battleship;

import application.UI;
import battleship.ship.Position;
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
        shipsToAdd.add(new Ship(new Position(), 1));
        shipsToAdd.add(new Ship(new Position(), 1));
        shipsToAdd.add(new Ship(new Position(), 1));
        shipsToAdd.add(new Ship(new Position(), 1));
        shipsToAdd.add(new Ship(new Position(), 1));
        shipsToAdd.add(new Ship(new Position(), 2));
        shipsToAdd.add(new Ship(new Position(), 2));
        shipsToAdd.add(new Ship(new Position(), 2));
        shipsToAdd.add(new Ship(new Position(), 3));
        shipsToAdd.add(new Ship(new Position(), 3));
        return shipsToAdd;
    }

    public Board() {
        this.board = new Ship[10][10];
    }

    public void addShips(List<Ship> shipsToAdd, Scanner sc) {
        for(Ship s : shipsToAdd){
            UI.clearScreen();
            System.out.println("Adding ships: ");
            UI.drawBoard(this);
            System.out.println("Insira o x: ");
            s.getPosition().setX(sc.nextInt());
            System.out.println("Insira o y: ");
            s.getPosition().setY(sc.nextInt());
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
