package data.game;

import data.game.player.Player;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;

public class Game {
    private ObjectProperty<ObservableList<Player>> players;

    public Game() {
        players = new SimpleObjectProperty<ObservableList<Player>>();
    }
}
