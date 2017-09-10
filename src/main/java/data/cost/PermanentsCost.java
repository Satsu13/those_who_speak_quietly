package data.cost;

public class PermanentsCost extends Cost {
    private boolean mustTurnSideways;

    public boolean isMustTurnSideways() {
        return mustTurnSideways;
    }

    public void setMustTurnSideways(boolean mustTurnSideways) {
        this.mustTurnSideways = mustTurnSideways;
    }
}
