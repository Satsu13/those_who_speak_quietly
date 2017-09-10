package data.collection;

import data.collection.card.Card;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.util.List;

public class Deck {
    public final ObjectProperty<String> name;

    public final ObjectProperty<List<Card>> cards;

    public Deck() {
        name = new SimpleObjectProperty<String>();
        cards = new SimpleObjectProperty<List<Card>>();
    }
}
