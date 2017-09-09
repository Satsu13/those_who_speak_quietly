package data.card;

import data.ability.Ability;
import data.mana.cost.Cost;

import java.util.List;

public class Card {
    private String name;

    private Cost cost;

    private List<Ability> abilities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cost getCost() {
        return cost;
    }

    public void setCost(Cost cost) {
        this.cost = cost;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }
}
