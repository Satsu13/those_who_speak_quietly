package data.game.player.board;

import data.collection.Deck;
import data.collection.card.permanent.Permanent;

import java.util.List;

public class Board {
    private Hand hand;

    private Graveyard graveyard;

    private Deck deck;

    private List<Permanent> permanents;

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Graveyard getGraveyard() {
        return graveyard;
    }

    public void setGraveyard(Graveyard graveyard) {
        this.graveyard = graveyard;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public List<Permanent> getPermanents() {
        return permanents;
    }

    public void setPermanents(List<Permanent> permanents) {
        this.permanents = permanents;
    }
}
