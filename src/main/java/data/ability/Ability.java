package data.ability;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Ability {
    private ObjectProperty<Boolean> hasName;

    private ObjectProperty<String> name;

    private ObjectProperty<String> description;

    public Ability() {
        hasName = new SimpleObjectProperty<Boolean>();
        name = new SimpleObjectProperty<String>();
        description = new SimpleObjectProperty<String>();
    }
}
