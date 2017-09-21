package those.who.speak.quietly.back_end.data.game.player.board;

import those.who.speak.quietly.back_end.data.collection.card.Card;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;

public class Graveyard {
    private ObjectProperty<ObservableList<Card>> cards;

    public Graveyard() {
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
