package those.who.speak.quietly.data.game.player.board;

import those.who.speak.quietly.data.collection.card.Card;
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

    public Card getOriginalCard() {
        return originalCard.get();
    }

    public ObjectProperty<Card> originalCardProperty() {
        return originalCard;
    }

    public void setOriginalCard(Card originalCard) {
        this.originalCard.set(originalCard);
    }

    public Card getActiveCard() {
        return activeCard.get();
    }

    public ObjectProperty<Card> activeCardProperty() {
        return activeCard;
    }

    public void setActiveCard(Card activeCard) {
        this.activeCard.set(activeCard);
    }

    public Boolean getIsCranked() {
        return isCranked.get();
    }

    public ObjectProperty<Boolean> isCrankedProperty() {
        return isCranked;
    }

    public void setIsCranked(Boolean isCranked) {
        this.isCranked.set(isCranked);
    }
}
