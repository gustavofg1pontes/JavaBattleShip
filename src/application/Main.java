package application;

import battleship.BattleshipMatch;
import battleship.ship.Position;
import battleship.ship.Ship;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BattleshipMatch match = new BattleshipMatch();
        List<Ship> shipsToAdd = match.getCurrentBoard().initializeShipsToAdd();
        Scanner sc = new Scanner(System.in);

        UI.clearScreen();
        match.getCurrentBoard().addShips(shipsToAdd, sc);
        match.changePlayer();
        shipsToAdd = match.getCurrentBoard().initializeShipsToAdd();
        match.getCurrentBoard().addShips(shipsToAdd, sc);
    }
}