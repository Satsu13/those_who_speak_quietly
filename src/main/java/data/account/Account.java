package data.account;

import data.collection.Collection;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Account {
    public final ObjectProperty<String> name;
    
    public final ObjectProperty<Collection> collection;

    public Account() {
        name = new SimpleObjectProperty<String>();
        collection = new SimpleObjectProperty<Collection>();
    }
}
