package N9_objekter_i_objekter_16_02_2024;

public class ClockDisplay {

    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;

    public ClockDisplay() {

        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }


    public void timeTick() {
        minutes.increment();

        if(minutes.getValue() == 0) {
            hours.increment();
        }

        updateDisplay();

    }

    public String getDisplayString() {

        return displayString;
    }

    private void updateDisplay() {
        displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }
}

