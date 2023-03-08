package ship;

import battleship.Board;

public class ShipPosition extends Position {
    private Position position;
    private char ch;
    private int num = -1;

    public ShipPosition() {
    }

    public void setValues(Position p, char ch, int num) {
        this.position = p;
        this.num = num;
        this.ch = ch;
    }

    public Position transformToPosition() {
        int index = this.positionLetter();
        return new Position(10 - this.num, index);
    }

    public int positionLetter() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int index = alphabet.indexOf(this.ch);
        return index;
    }

    public boolean isShipPositionValid() {
        return this.positionLetter() >= 0 && this.positionLetter() <= 10 && this.num >= 1 && this.num <= 10;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

}
