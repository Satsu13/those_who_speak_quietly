package data.game;

import data.game.player.InGamePlayer;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.util.List;

public class Game {
    public final ObjectProperty<List<InGamePlayer>> players;

    public Game() {
        players = new SimpleObjectProperty<List<InGamePlayer>>();
    }
}
