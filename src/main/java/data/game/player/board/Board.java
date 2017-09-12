package data.game.player.board;

import data.collection.Deck;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;

public class Board {
    private ObjectProperty<Hand> hand;

    private ObjectProperty<Graveyard> graveyard;

    private ObjectProperty<Deck> deck;

    private ObjectProperty<ObservableList<Permanent>> permanents;

    public Board() {
        hand = new SimpleObjectProperty<Hand>();
        graveyard = new SimpleObjectProperty<Graveyard>();
        deck = new SimpleObjectProperty<Deck>();
        permanents = new SimpleObjectProperty<ObservableList<Permanent>>();
    }
}
