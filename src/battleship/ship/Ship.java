package battleship.ship;

public class Ship {
    private Position position;
    private int size;
    private int dir;

    public Ship(Position position) {
        this.position = position;
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
    public String toString(){
        return "S";
    }
}
