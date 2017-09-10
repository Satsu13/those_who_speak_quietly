package data.collection.card.permanent.creature;

import data.collection.card.permanent.Permanent;

public class Creature extends Permanent {
    private int attack;

    private int health;

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
