package data.mana.cost;

import data.mana.unit.Mana;

public class Cost {
    private Mana color;
    private int amount;

    public Mana getColor() {
        return color;
    }

    public void setColor(Mana color) {
        this.color = color;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
