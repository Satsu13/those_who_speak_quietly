package data.ability;

import data.cost.PermanentsCost;

public class ActivatedAbility extends Ability {
    private PermanentsCost cost;

    public PermanentsCost getCost() {
        return cost;
    }

    public void setCost(PermanentsCost cost) {
        this.cost = cost;
    }
}
