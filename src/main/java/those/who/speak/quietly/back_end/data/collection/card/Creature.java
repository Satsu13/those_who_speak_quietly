package those.who.speak.quietly.back_end.data.collection.card;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Creature extends Card {
    private ObjectProperty<Integer> attack;

    private ObjectProperty<Integer> health;

    public Creature() {
        attack = new SimpleObjectProperty<Integer>();
        health = new SimpleObjectProperty<Integer>();
    }

    public Integer getAttack() {
        return attack.get();
    }

    public ObjectProperty<Integer> attackProperty() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack.set(attack);
    }

    public Integer getHealth() {
        return health.get();
    }

    public ObjectProperty<Integer> healthProperty() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health.set(health);
    }
}
