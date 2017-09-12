package data.collection.card;

import data.ability.Ability;
import data.cost.Cost;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;

public class Card {
    public final ObjectProperty<String> name;

    public final ObjectProperty<Cost> cost;

    public final ObjectProperty<String> type;

    public final ObjectProperty<ObservableList<Ability>> abilities;

    public final ObjectProperty<String> flavorText;
    
    public Card() {
        name = new SimpleObjectProperty<String>();
        cost = new SimpleObjectProperty<Cost>();
        type = new SimpleObjectProperty<String>();
        abilities = new SimpleObjectProperty<ObservableList<Ability>>();
        flavorText = new SimpleObjectProperty<String>();
    }
}
