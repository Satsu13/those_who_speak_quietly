package data.mana;

public abstract class Mana {
    private String name;

    public Mana() {
        this.name = setName();
    }

    protected abstract String setName();

    public String getName() {
        return name;
    }
}
