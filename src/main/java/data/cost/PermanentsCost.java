package data.cost;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class PermanentsCost extends Cost {
    private ObjectProperty<Boolean> mustBeCranked;

    public PermanentsCost() {
        mustBeCranked = new SimpleObjectProperty<Boolean>();
    }
}
