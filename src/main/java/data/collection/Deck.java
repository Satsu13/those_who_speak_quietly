package data.collection;

import data.collection.card.Card;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;

public class Deck {
    public final ObjectProperty<String> name;

    public final ObjectProperty<ObservableList<Card>> cards;

    public Deck() {
        name = new SimpleObjectProperty<String>();
        cards = new SimpleObjectProperty<ObservableList<Card>>();
    }
}
