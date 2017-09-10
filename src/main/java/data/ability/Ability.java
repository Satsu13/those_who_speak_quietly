package data.ability;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Ability {
   public final ObjectProperty<Boolean> hasName;

    public final ObjectProperty<String> name;

    public final ObjectProperty<String> description;

    public Ability() {
        hasName = new SimpleObjectProperty<Boolean>();
        name = new SimpleObjectProperty<String>();
        description = new SimpleObjectProperty<String>();
    }
}
