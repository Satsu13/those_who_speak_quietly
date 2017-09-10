package data.collection;

import data.collection.card.Card;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.util.List;

public class Collection {
    public final ObjectProperty<List<Card>> cards;

    public final ObjectProperty<List<Deck>> decks;

    public Collection() {
        cards = new SimpleObjectProperty<List<Card>>();
        decks = new SimpleObjectProperty<List<Deck>>();
    }
}
