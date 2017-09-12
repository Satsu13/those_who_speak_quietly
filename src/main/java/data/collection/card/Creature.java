package data.collection.card;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Creature extends Card {
    private ObjectProperty<Integer> attack;

    private ObjectProperty<Integer> health;

    public Creature() {
        attack = new SimpleObjectProperty<Integer>();
        health = new SimpleObjectProperty<Integer>();
    }
}
