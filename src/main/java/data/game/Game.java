package data.game;

import data.game.player.InGamePlayer;

import java.util.List;

public class Game {
    private List<InGamePlayer> players;

    public List<InGamePlayer> getPlayers() {
        return players;
    }

    public void setPlayers(List<InGamePlayer> players) {
        this.players = players;
    }
}
