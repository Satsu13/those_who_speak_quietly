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

    public String getName() {
        return name.get();
    }

    public ObjectProperty<String> nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public ObservableList<Card> getCards() {
        return cards.get();
    }

    public ObjectProperty<ObservableList<Card>> cardsProperty() {
        return cards;
    }

    public void setCards(ObservableList<Card> cards) {
        this.cards.set(cards);
    }
}
