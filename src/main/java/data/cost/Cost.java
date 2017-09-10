package data.cost;

import data.mana.Mana;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Cost {
    public final ObjectProperty<Mana> type;

    public final ObjectProperty<Integer> amount;

    public Cost() {
        type = new SimpleObjectProperty<Mana>();
        amount = new SimpleObjectProperty<Integer>();
    }
}
