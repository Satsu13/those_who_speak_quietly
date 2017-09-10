package data.collection.card;

import data.ability.Ability;
import data.cost.Cost;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.util.List;

public class Card {
    public final ObjectProperty<String> name;

    public final ObjectProperty<Cost> cost;

    public final ObjectProperty<List<Ability>> abilities;

    public final ObjectProperty<String> flavorText;


    public Card() {
        name = new SimpleObjectProperty<String>();
        cost = new SimpleObjectProperty<Cost>();
        abilities = new SimpleObjectProperty<List<Ability>>();
        flavorText = new SimpleObjectProperty<String>();
    }
}
