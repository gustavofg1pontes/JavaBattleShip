package battleship;

import ship.Position;
import ship.Ship;

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

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public int getPlayer() {
        return player;
    }

    public void changePlayer(Scanner sc) {
        this.player = this.player == 1 ? 2 : 1;
        System.out.println("Current player: " + this.getPlayer());
        System.out.print("Press enter");
        sc.nextLine();
    }

    public Board getCurrentBoard() {
        return (this.player == 1) ? board1 : board2;
    }

    public List<Ship> initializeShipsToAdd() {
        shipsToAdd.add(new Ship(new Position(), 1));
       /* shipsToAdd.add(new Ship(new Position(), 1));
        shipsToAdd.add(new Ship(new Position(), 1));
        shipsToAdd.add(new Ship(new Position(), 1));
        shipsToAdd.add(new Ship(new Position(), 1));
        shipsToAdd.add(new Ship(new Position(), 2));
        shipsToAdd.add(new Ship(new Position(), 2));
        shipsToAdd.add(new Ship(new Position(), 2));
        shipsToAdd.add(new Ship(new Position(), 3));
        shipsToAdd.add(new Ship(new Position(), 3));*/
        return shipsToAdd;
    }
}
