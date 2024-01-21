import java.util.ArrayList;

public class rolls {
    private ArrayList<dice> diceRolls = new ArrayList<dice>();

    public rolls(int amount, int type) {
        for (int i = 0; i < amount; i++) {
            diceRolls.add(new dice(type));
        }
    }

    public void rollAll() {
        for (int i = 0; i < diceRolls.size(); i++) {
            diceRolls.get(i).roll();
        }
    }

    public int returnSum() {
        int sum = 0;
        for (int i = 0; i < diceRolls.size(); i++) {
            sum += diceRolls.get(i).getOutcome();
        }
        return sum;
    }

    public void dropLowest() {
        int minIndex = 0;
        for (int i = 0; i < diceRolls.size(); i++) {
            if (diceRolls.get(i).getOutcome() < diceRolls.get(minIndex).getOutcome()) {
                minIndex = i;
            }
        }
        diceRolls.remove(minIndex);
    }

    public void dropHighest() {
        int maxIndex = 0;
        for (int i = 0; i < diceRolls.size(); i++) {
            if (diceRolls.get(i).getOutcome() > diceRolls.get(maxIndex).getOutcome()) {
                maxIndex = i;
            }
        }
        diceRolls.remove(maxIndex);
    }

    public int getSize() {
        return diceRolls.size();
    }

    public void setOutcomeAt(int index, int outcome) {
        diceRolls.get(index).setOutcome(outcome);
    }

    public int getOutcomeAt(int index) {
        return diceRolls.get(index).getOutcome();
    }

    public void reRollAt(int index) {
        diceRolls.get(index).roll();
    }


}
