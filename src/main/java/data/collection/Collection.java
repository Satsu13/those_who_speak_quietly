package data.collection;

import data.collection.card.Card;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;

public class Collection {
    private ObjectProperty<ObservableList<Card>> cards;

    private ObjectProperty<ObservableList<Deck>> decks;

    public Collection() {
        cards = new SimpleObjectProperty<ObservableList<Card>>();
        decks = new SimpleObjectProperty<ObservableList<Deck>>();
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

    public ObservableList<Deck> getDecks() {
        return decks.get();
    }

    public ObjectProperty<ObservableList<Deck>> decksProperty() {
        return decks;
    }

    public void setDecks(ObservableList<Deck> decks) {
        this.decks.set(decks);
    }
}
