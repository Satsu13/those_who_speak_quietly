package data.game;

import data.game.board.Board;
import data.game.player.InGamePlayer;

import java.util.List;

public class Game {
    private List<InGamePlayer> players;
    private Board board;

    public List<InGamePlayer> getPlayers() {
        return players;
    }

    public void setPlayers(List<InGamePlayer> players) {
        this.players = players;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}
