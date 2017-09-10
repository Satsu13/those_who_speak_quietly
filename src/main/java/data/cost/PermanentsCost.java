package data.cost;

public class PermanentsCost extends Cost {
    private boolean mustBeCranked;

    public boolean isMustBeCranked() {
        return mustBeCranked;
    }

    public void setMustBeCranked(boolean mustBeCranked) {
        this.mustBeCranked = mustBeCranked;
    }
}
