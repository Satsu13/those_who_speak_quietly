package those.who.speak.quietly.data.game;

import those.who.speak.quietly.data.game.player.Player;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;

public class Game {
    private ObjectProperty<ObservableList<Player>> players;

    public Game() {
        players = new SimpleObjectProperty<ObservableList<Player>>();
    }

    public ObservableList<Player> getPlayers() {
        return players.get();
    }

    public ObjectProperty<ObservableList<Player>> playersProperty() {
        return players;
    }

    public void setPlayers(ObservableList<Player> players) {
        this.players.set(players);
    }
}
