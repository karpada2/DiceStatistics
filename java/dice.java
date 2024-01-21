public class dice {
    private int outcome;
    private int type; //e.g. d6, d12 etc.
    public dice(int type) {
        this.type = type;
    }

    public dice(dice anotherDice) {
        this.type = anotherDice.type;
        this.outcome = anotherDice.outcome;
    }

    public int roll() {
        outcome = 1 + (int)(Math.random() * ((this.type - 1) + 1));
        return outcome;
    }

    public int getOutcome() {
        return outcome;
    }

    public int getType() {
        return type;
    }

    public void setOutcome(int outcome) {
        this.outcome = outcome;
    }

    public void setType(int type) {
        this.type = type;
    }
}
