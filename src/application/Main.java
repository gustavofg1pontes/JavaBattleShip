package application;

import battleship.BattleshipMatch;
import ship.Ship;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BattleshipMatch match = new BattleshipMatch();
        List<Ship> shipsToAdd = match.initializeShipsToAdd();
        Scanner sc = new Scanner(System.in);

        //adding ships
        match.getCurrentBoard().addShips(shipsToAdd, sc);
        match.changePlayer(sc);
        match.getCurrentBoard().addShips(shipsToAdd, sc);
        shipsToAdd = null;
    }
}