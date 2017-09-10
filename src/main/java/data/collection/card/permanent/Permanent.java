package data.collection.card.permanent;

import data.collection.card.Card;

public class Permanent extends Card {
    private boolean isCranked;

    public boolean isCranked() {
        return isCranked;
    }

    public void setCranked(boolean cranked) {
        isCranked = cranked;
    }
}
