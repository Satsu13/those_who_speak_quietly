package data.game;

import data.game.player.Player;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.util.List;

public class Game {
    public final ObjectProperty<List<Player>> players;

    public Game() {
        players = new SimpleObjectProperty<List<Player>>();
    }
}
