package data.collection;

import data.collection.card.Card;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;

public class Deck {
    private ObjectProperty<String> name;

    private ObjectProperty<ObservableList<Card>> cards;

    public Deck() {
        name = new SimpleObjectProperty<String>();
        cards = new SimpleObjectProperty<ObservableList<Card>>();
    }
}
