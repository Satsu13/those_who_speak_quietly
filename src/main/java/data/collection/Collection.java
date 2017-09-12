package data.collection;

import data.collection.card.Card;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;

public class Collection {
    public final ObjectProperty<ObservableList<Card>> cards;

    public final ObjectProperty<ObservableList<Deck>> decks;

    public Collection() {
        cards = new SimpleObjectProperty<ObservableList<Card>>();
        decks = new SimpleObjectProperty<ObservableList<Deck>>();
    }
}
