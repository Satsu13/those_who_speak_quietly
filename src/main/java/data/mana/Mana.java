package data.mana;

public abstract class Mana {
    private String name;

    public Mana() {
        this.name = abstractGetName();
    }

    protected abstract String abstractGetName();

    public String getName() {
        return name;
    }
}
