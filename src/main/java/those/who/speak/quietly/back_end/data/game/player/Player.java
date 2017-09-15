package those.who.speak.quietly.data.game.player;

import those.who.speak.quietly.data.game.player.board.Board;
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

    public String getName() {
        return name.get();
    }

    public ObjectProperty<String> nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public Board getBoard() {
        return board.get();
    }

    public ObjectProperty<Board> boardProperty() {
        return board;
    }

    public void setBoard(Board board) {
        this.board.set(board);
    }

    public Integer getLife() {
        return life.get();
    }

    public ObjectProperty<Integer> lifeProperty() {
        return life;
    }

    public void setLife(Integer life) {
        this.life.set(life);
    }
}
