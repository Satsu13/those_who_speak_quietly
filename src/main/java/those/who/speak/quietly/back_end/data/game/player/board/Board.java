package those.who.speak.quietly.data.game.player.board;

import those.who.speak.quietly.data.collection.Deck;
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

    public Hand getHand() {
        return hand.get();
    }

    public ObjectProperty<Hand> handProperty() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand.set(hand);
    }

    public Graveyard getGraveyard() {
        return graveyard.get();
    }

    public ObjectProperty<Graveyard> graveyardProperty() {
        return graveyard;
    }

    public void setGraveyard(Graveyard graveyard) {
        this.graveyard.set(graveyard);
    }

    public Deck getDeck() {
        return deck.get();
    }

    public ObjectProperty<Deck> deckProperty() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck.set(deck);
    }

    public ObservableList<Permanent> getPermanents() {
        return permanents.get();
    }

    public ObjectProperty<ObservableList<Permanent>> permanentsProperty() {
        return permanents;
    }

    public void setPermanents(ObservableList<Permanent> permanents) {
        this.permanents.set(permanents);
    }
}
