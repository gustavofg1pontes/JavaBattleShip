package battleship;

import application.UI;
import ship.Position;
import ship.Ship;
import ship.ShipPosition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BattleshipMatch {
    private int player;
    private boolean winner;
    private Board board1;
    private Board board2;
    private List<Ship> shipsToAdd = new ArrayList<>();

    public BattleshipMatch() {
        this.player = 1;
        this.board1 = new Board();
        this.board2 = new Board();
    }

    public boolean getWinner() {
        return winner;
    }

    public int getPlayer() {
        return player;
    }

    public void changePlayer(Scanner sc) {
        this.player = this.player == 1 ? 2 : 1;
        UI.clearScreen();
        System.out.println("Current player: " + this.getPlayer());
        System.out.print("Press enter");
        sc.nextLine();
    }

    public Ship makePlay(Scanner sc) {
        ShipPosition sp = new ShipPosition();
        Ship s = new Ship();
        do {
            UI.clearScreen();
            System.out.println("Turn: " + "player " + getPlayer());
            UI.drawBoard(getCurrentBoard());
            System.out.print("Enter a valid position to attack (ex: c2, b4, j10...): ");
            String pos = sc.nextLine();
            if (pos.length() == 2 && Character.isDigit(pos.charAt(1))) {
                sp.setValues(s.getPosition(), pos.charAt(0), Integer.parseInt(pos.substring(1, 2)));
                s.setPosition(sp.transformToPosition());
            } else if (pos.length() == 3 && Character.isDigit(pos.charAt(1)) && Character.isDigit(pos.charAt(2))) {
                sp.setValues(s.getPosition(), pos.charAt(0), Integer.parseInt(pos.substring(1, 3)));
                s.setPosition(sp.transformToPosition());
            }
        } while (!sp.isShipPositionValid());
        if (this.getOpponnentBoard().getBoard()[s.getPosition().getX()][s.getPosition().getY()] != null) {
            System.out.println("You've hit an enemy's ship!");
            isThereAWinner(getOpponnentBoard());
            sc.nextLine();
        } else {
            System.out.println("You've missed");
            sc.nextLine();
        }
        return this.removeAndCheckWinner(s);
    }

    public Ship removeAndCheckWinner(Ship s){
        Ship ship = this.getOpponnentBoard().removeShip(s);
        isThereAWinner(getOpponnentBoard());
        return ship;
    }

    public void isThereAWinner(Board board){
        int quantityOccupied = board.getBoard().length * board.getBoard().length;
        for (int i = 0; i < board.getBoard().length; i++) {
            for (int j = 0; j < board.getBoard().length; j++) {
                if(board.getBoard()[i][j] == null) quantityOccupied--;
            }
        }
        winner = quantityOccupied == 0;
    }
    public Board getCurrentBoard() {
        return (this.player == 1) ? board1 : board2;
    }

    public Board getOpponnentBoard() {
        return (this.player == 1) ? board2 : board1;
    }

    public List<Ship> initializeShipsToAdd() {
        shipsToAdd.add(new Ship(new Position()));
        shipsToAdd.add(new Ship(new Position()));
        shipsToAdd.add(new Ship(new Position()));
        shipsToAdd.add(new Ship(new Position()));
        shipsToAdd.add(new Ship(new Position()));
        shipsToAdd.add(new Ship(new Position()));
        shipsToAdd.add(new Ship(new Position()));
        shipsToAdd.add(new Ship(new Position()));
        shipsToAdd.add(new Ship(new Position()));
        shipsToAdd.add(new Ship(new Position()));
        shipsToAdd.add(new Ship(new Position()));
        return shipsToAdd;
    }
}
