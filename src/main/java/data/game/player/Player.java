package data.game.player;

import data.game.player.board.Board;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Player {
    private ObjectProperty<String> name;

    private ObjectProperty<Board> board;

    private ObjectProperty<Integer> life;

    public Player() {
        name = new SimpleObjectProperty<String>();
        board = new SimpleObjectProperty<Board>();
        life = new SimpleObjectProperty<Integer>();
    }
}
