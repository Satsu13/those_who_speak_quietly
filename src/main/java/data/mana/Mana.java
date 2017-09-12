package data.mana;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Mana {
    private ObjectProperty<String> type;

    public Mana() {
        type = new SimpleObjectProperty<String>();
    }
}
