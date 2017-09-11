package data.game.player.board;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Permanent {
    public final ObjectProperty<Boolean> isCranked;

    public Permanent() {
        isCranked = new SimpleObjectProperty<Boolean>();
    }
}