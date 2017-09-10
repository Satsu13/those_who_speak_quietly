package data.game.player.board;

import data.collection.card.permanent.Permanent;

import java.util.List;

public class Board {
    private Hand hand;

    private Graveyard graveyard;

    private InGameDeck deck;

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

    public InGameDeck getDeck() {
        return deck;
    }

    public void setDeck(InGameDeck deck) {
        this.deck = deck;
    }

    public List<Permanent> getPermanents() {
        return permanents;
    }

    public void setPermanents(List<Permanent> permanents) {
        this.permanents = permanents;
    }
}
