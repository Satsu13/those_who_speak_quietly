package data.ability;

import data.cost.Cost;

public class ActivatedAbility extends Ability {
    private Cost cost;

    public Cost getCost() {
        return cost;
    }

    public void setCost(Cost cost) {
        this.cost = cost;
    }
}
