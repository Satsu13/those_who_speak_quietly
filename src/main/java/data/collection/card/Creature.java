package data.collection.card;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Creature extends Card {
    public final ObjectProperty<Integer> attack;

    public final ObjectProperty<Integer> health;

    public Creature() {
        attack = new SimpleObjectProperty<Integer>();
        health = new SimpleObjectProperty<Integer>();
    }
}
