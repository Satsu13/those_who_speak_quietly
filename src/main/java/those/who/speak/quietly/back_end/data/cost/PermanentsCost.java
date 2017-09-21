package those.who.speak.quietly.back_end.data.cost;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class PermanentsCost extends Cost {
    private ObjectProperty<Boolean> mustBeCranked;

    public PermanentsCost() {
        mustBeCranked = new SimpleObjectProperty<Boolean>();
    }

    public Boolean getMustBeCranked() {
        return mustBeCranked.get();
    }

    public ObjectProperty<Boolean> mustBeCrankedProperty() {
        return mustBeCranked;
    }

    public void setMustBeCranked(Boolean mustBeCranked) {
        this.mustBeCranked.set(mustBeCranked);
    }
}
