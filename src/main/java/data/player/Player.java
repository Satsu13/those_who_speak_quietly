package data.player;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Player {
    public final ObjectProperty<String> name;

    public Player() {
        name = new SimpleObjectProperty<String>();
    }
}
