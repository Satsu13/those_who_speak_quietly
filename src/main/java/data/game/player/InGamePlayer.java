package data.game.player;

import data.game.player.board.Board;
import data.account.Account;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class InGamePlayer extends Account {
    public final ObjectProperty<Board> board;

    public final ObjectProperty<Integer> life;

    public InGamePlayer() {
        board = new SimpleObjectProperty<Board>();
        life = new SimpleObjectProperty<Integer>();
    }
}
