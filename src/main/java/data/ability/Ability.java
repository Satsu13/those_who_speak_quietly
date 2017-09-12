package data.ability;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Ability {
    private ObjectProperty<Boolean> hasName;

    private ObjectProperty<String> name;

    private ObjectProperty<String> description;

    public Ability() {
        hasName = new SimpleObjectProperty<Boolean>();
        name = new SimpleObjectProperty<String>();
        description = new SimpleObjectProperty<String>();
    }

    public Boolean getHasName() {
        return hasName.get();
    }

    public ObjectProperty<Boolean> hasNameProperty() {
        return hasName;
    }

    public void setHasName(Boolean hasName) {
        this.hasName.set(hasName);
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

    public String getDescription() {
        return description.get();
    }

    public ObjectProperty<String> descriptionProperty() {
        return description;
    }

    public void setDescription(String description) {
        this.description.set(description);
    }
}
