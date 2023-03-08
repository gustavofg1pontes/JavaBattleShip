package ship;

public class Ship {
    private Position position;
    public Ship() {
    }

    public Ship(Position position) {
        this.position = position;
    }


    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "S";
    }
}
