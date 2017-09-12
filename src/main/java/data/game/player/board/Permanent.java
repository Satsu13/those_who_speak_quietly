package data.game.player.board;

import data.collection.card.Card;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Permanent {
    private ObjectProperty<Card> originalCard;

    private ObjectProperty<Card> activeCard;

    private ObjectProperty<Boolean> isCranked;

    public Permanent() {
        originalCard = new SimpleObjectProperty<Card>();
        activeCard = new SimpleObjectProperty<Card>();
        isCranked = new SimpleObjectProperty<Boolean>();
    }
}
