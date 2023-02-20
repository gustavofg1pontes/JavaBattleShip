package battleship.ship;

public class Ship {
    private Position position;
    private int size;
    private int dir;

    public Ship() {
    }

    public Ship(Position position) {
        this.position = position;
        this.size = 1;
    }
    public Ship(Position position, int size, int dir) {
        this.position = position;
        this.size = size;
        this.dir = dir;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    @Override
    public String toString() {
        return "S";
    }
}
