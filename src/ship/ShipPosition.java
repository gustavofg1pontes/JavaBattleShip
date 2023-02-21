package ship;

public class ShipPosition extends Position{
    public static Position transformToPosition(char ch, int num){
        int index = positionLetter(ch);
        return new Position(10 - num, index);
    }
    public static int positionLetter(char ch){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int index = alphabet.indexOf(ch);
        return index;
    }
}
