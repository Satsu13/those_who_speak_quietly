package data.game.player.board;

import data.collection.card.Card;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;

public class Graveyard {
    private ObjectProperty<ObservableList<Card>> cards;

    public Graveyard() {
        cards = new SimpleObjectProperty<ObservableList<Card>>();
    }
}
