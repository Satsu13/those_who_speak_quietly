package those.who.speak.quietly.back_end.data.collection.card;

import those.who.speak.quietly.back_end.data.ability.Ability;
import those.who.speak.quietly.back_end.data.cost.Cost;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;

public class Card {
    private ObjectProperty<String> name;

    private ObjectProperty<Cost> cost;

    private ObjectProperty<String> type;

    private ObjectProperty<ObservableList<Ability>> abilities;

    private ObjectProperty<String> flavorText;
    
    public Card() {
        name = new SimpleObjectProperty<String>();
        cost = new SimpleObjectProperty<Cost>();
        type = new SimpleObjectProperty<String>();
        abilities = new SimpleObjectProperty<ObservableList<Ability>>();
        flavorText = new SimpleObjectProperty<String>();
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

    public Cost getCost() {
        return cost.get();
    }

    public ObjectProperty<Cost> costProperty() {
        return cost;
    }

    public void setCost(Cost cost) {
        this.cost.set(cost);
    }

    public String getType() {
        return type.get();
    }

    public ObjectProperty<String> typeProperty() {
        return type;
    }

    public void setType(String type) {
        this.type.set(type);
    }

    public ObservableList<Ability> getAbilities() {
        return abilities.get();
    }

    public ObjectProperty<ObservableList<Ability>> abilitiesProperty() {
        return abilities;
    }

    public void setAbilities(ObservableList<Ability> abilities) {
        this.abilities.set(abilities);
    }

    public String getFlavorText() {
        return flavorText.get();
    }

    public ObjectProperty<String> flavorTextProperty() {
        return flavorText;
    }

    public void setFlavorText(String flavorText) {
        this.flavorText.set(flavorText);
    }
}
