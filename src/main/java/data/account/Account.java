package data.account;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Account {
    public final ObjectProperty<String> name;

    public Account() {
        name = new SimpleObjectProperty<String>();
    }
}
