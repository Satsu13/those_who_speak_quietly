package data.game.player;

import data.game.player.board.Board;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Player {
    public final ObjectProperty<String> name;

    public final ObjectProperty<Board> board;

    public final ObjectProperty<Integer> life;

    public Player() {
        name = new SimpleObjectProperty<String>();
        board = new SimpleObjectProperty<Board>();
        life = new SimpleObjectProperty<Integer>();
    }
}
