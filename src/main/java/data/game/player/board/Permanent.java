package data.game.player.board;

import data.collection.card.Card;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Permanent {
    public final ObjectProperty<Card> originalCard;

    public final ObjectProperty<Card> activeCard;

    public final ObjectProperty<Boolean> isCranked;

    public Permanent() {
        originalCard = new SimpleObjectProperty<Card>();
        activeCard = new SimpleObjectProperty<Card>();
        isCranked = new SimpleObjectProperty<Boolean>();
    }
}
