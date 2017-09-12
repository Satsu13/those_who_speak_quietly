package data.account;

import data.collection.Collection;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Account {
    private ObjectProperty<String> name;

    private ObjectProperty<Collection> collection;

    public Account() {
        name = new SimpleObjectProperty<String>();
        collection = new SimpleObjectProperty<Collection>();
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

    public Collection getCollection() {
        return collection.get();
    }

    public ObjectProperty<Collection> collectionProperty() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection.set(collection);
    }
}
