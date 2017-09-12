package data.collection.card;

import data.ability.Ability;
import data.cost.Cost;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;

public class Card {
    private ObjectProperty<String> name;

    private ObjectProperty<Cost> cost;

    private ObjectProperty<String> type;

    private ObjectProperty<ObservableList<Ability>> abilities;

    private ObjectProperty<String> flavorText;
    
    public Card() {
        name = new SimpleObjectProperty<String>();
        cost = new SimpleObjectProperty<Cost>();
        type = new SimpleObjectProperty<String>();
        abilities = new SimpleObjectProperty<ObservableList<Ability>>();
        flavorText = new SimpleObjectProperty<String>();
    }
}
