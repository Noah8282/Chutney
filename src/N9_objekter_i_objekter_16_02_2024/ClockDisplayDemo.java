package N9_objekter_i_objekter_16_02_2024;

public class ClockDisplayDemo {

    public static void main(String[] args) throws InterruptedException {
        ClockDisplay myClock = new ClockDisplay();

        while (true) {
            myClock.timeTick();
            System.out.println(myClock.getDisplayString());


            //Nedenstående er valgfri. Dette er blot for uret i konsollen faktisk kun kører 1 gang pr sekund (Hvert 1000 millisekund)
            Thread.sleep(1000); // Sleep for 1000 milliseconds (1 second)
        }

    }
}
