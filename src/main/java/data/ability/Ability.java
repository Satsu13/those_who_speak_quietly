package data.ability;

import data.mana.cost.Cost;

public class Ability {
    private boolean hasName;

    private String name;

    private boolean hasCost;

    private Cost cost;

    private String description;

    public boolean isHasName() {
        return hasName;
    }

    public void setHasName(boolean hasName) {
        this.hasName = hasName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasCost() {
        return hasCost;
    }

    public void setHasCost(boolean hasCost) {
        this.hasCost = hasCost;
    }

    public Cost getCost() {
        return cost;
    }

    public void setCost(Cost cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
