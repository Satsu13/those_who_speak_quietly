package data.game.player.board;

import data.collection.card.Card;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.util.List;

public class Hand {
    public final ObjectProperty<List<Card>> cards;

    public Hand() {
        cards = new SimpleObjectProperty<List<Card>>();
    }
}
