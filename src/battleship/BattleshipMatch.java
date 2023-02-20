package battleship;

public class BattleshipMatch {
    private int player;
    private Board board1;
    private Board board2;

    public BattleshipMatch() {
        this.player = 1;
        this.board1 = new Board();
        this.board2 = new Board();
    }

    public int getPlayer() {
        return player;
    }
    public void changePlayer() {
        this.player = this.player == 1 ? 2 : 1;
    }
    public Board getCurrentBoard() {
        return (this.player == 1) ? board1 : board2;
    }
}
