package data.game;

import data.game.board.Board;
import data.player.Player;

import java.util.List;

public class Game {
    private List<Player> players;
    private Board board;

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}
