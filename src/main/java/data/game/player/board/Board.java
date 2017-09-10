package data.game.player.board;

import data.collection.Deck;
import data.game.player.board.card.permanent.Permanent;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.util.List;

public class Board {
    public final ObjectProperty<Hand> hand;

    public final ObjectProperty<Graveyard> graveyard;

    public final ObjectProperty<Deck> deck;

    public final ObjectProperty<List<Permanent>> permanents;

    public Board() {
        hand = new SimpleObjectProperty<Hand>();
        graveyard = new SimpleObjectProperty<Graveyard>();
        deck = new SimpleObjectProperty<Deck>();
        permanents = new SimpleObjectProperty<List<Permanent>>();
    }
}
