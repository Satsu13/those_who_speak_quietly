package data.game.player.board;

import data.collection.card.Card;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.util.List;

public class Graveyard {
    public final ObjectProperty<List<Card>> cards;

    public Graveyard() {
        cards = new SimpleObjectProperty<List<Card>>();
    }
}
