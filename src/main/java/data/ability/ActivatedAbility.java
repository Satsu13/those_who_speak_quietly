package data.ability;

import data.cost.PermanentsCost;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class ActivatedAbility extends Ability {
    public final ObjectProperty<PermanentsCost> cost;

    public ActivatedAbility() {
        cost = new SimpleObjectProperty<PermanentsCost>();
    }
}
