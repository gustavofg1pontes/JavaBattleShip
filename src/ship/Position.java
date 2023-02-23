package ship;

import battleship.Board;

public class Position {
    private int x = -1;
    private int y = -1;

    public Position() {
    }

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
