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
        match.getCurrentBoard().addShips(shipsToAdd, sc, match);
        match.changePlayer(sc);
        match.getCurrentBoard().addShips(shipsToAdd, sc, match);
        shipsToAdd.clear();

        match.changePlayer(sc);

        while(!match.getWinner()){
            Ship s = match.makePlay(sc);
            if(!match.getWinner()) match.changePlayer(sc);
        }

        UI.clearScreen();
        System.out.println("Player " + match.getPlayer() + " won!");
    }
}