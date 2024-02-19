package N9_objekter_i_objekter_16_02_2024;

public class NumberDisplay {
    private int limit;
    private int value = 0;

    public NumberDisplay(int rollOverLimit) {
        limit = rollOverLimit;
    }


    public int getValue() {
        return value;
    }

    public String getDisplayValue() {
        if (value < 10) {
            return "0" + value;
        }
        return "" + value;
    }

    public void setValue(int replacementValue) {
        if (replacementValue >= 0 && replacementValue < limit) {
            value = replacementValue;
        }
    }

    public void increment() {
        value = (value + 1) % limit;
    }
}

