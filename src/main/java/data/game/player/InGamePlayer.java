package data.game.player;

import data.player.Player;

public class InGamePlayer extends Player {
    private Hand hand;
    
    private Board board;

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}
