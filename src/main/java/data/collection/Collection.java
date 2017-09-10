package data.collection;

import data.collection.card.Card;

import java.util.List;

public class Collection {
    private List<Card> cards;

    private List<Deck> decks;

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public List<Deck> getDecks() {
        return decks;
    }

    public void setDecks(List<Deck> decks) {
        this.decks = decks;
    }
}
