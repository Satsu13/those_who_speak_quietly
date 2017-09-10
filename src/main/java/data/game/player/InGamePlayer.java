package data.game.player;

import data.game.player.board.Board;
import data.player.Player;

public class InGamePlayer extends Player {
    private Board board;

    private int life;

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
}
