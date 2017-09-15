package data.game.player.board;

import data.collection.card.Card;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;

public class Hand {
    private ObjectProperty<ObservableList<Card>> cards;

    public Hand() {
        cards = new SimpleObjectProperty<ObservableList<Card>>();
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
