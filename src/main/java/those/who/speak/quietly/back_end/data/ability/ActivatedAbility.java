package those.who.speak.quietly.back_end.data.ability;

import those.who.speak.quietly.back_end.data.cost.PermanentsCost;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class ActivatedAbility extends Ability {
    private ObjectProperty<PermanentsCost> cost;

    public ActivatedAbility() {
        cost = new SimpleObjectProperty<PermanentsCost>();
    }

    public PermanentsCost getCost() {
        return cost.get();
    }

    public ObjectProperty<PermanentsCost> costProperty() {
        return cost;
    }

    public void setCost(PermanentsCost cost) {
        this.cost.set(cost);
    }
}
