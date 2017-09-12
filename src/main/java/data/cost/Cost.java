package data.cost;

import data.mana.Mana;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Cost {
    private ObjectProperty<Mana> type;

    private ObjectProperty<Integer> amount;

    public Cost() {
        type = new SimpleObjectProperty<Mana>();
        amount = new SimpleObjectProperty<Integer>();
    }

    public Mana getType() {
        return type.get();
    }

    public ObjectProperty<Mana> typeProperty() {
        return type;
    }

    public void setType(Mana type) {
        this.type.set(type);
    }

    public Integer getAmount() {
        return amount.get();
    }

    public ObjectProperty<Integer> amountProperty() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount.set(amount);
    }
}
