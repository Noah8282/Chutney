package N2_IO_scanner_01_02_2024;

import java.util.Date;
import java.util.Scanner;

public class Tidsberegner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long firstRun = new Date().getTime()/1000;
        while(scanner.next().equalsIgnoreCase("kør")) {
            long whenRun = new Date().getTime()/1000;
            long midnight = (whenRun%86400)+3600;
            long[] timeFromMidnight = convertTime(midnight);
            long[] timeBetween = convertTime(whenRun - firstRun);

            System.out.println("Time from program: "+timeBetween[0] + ":"+timeBetween[1]+":"+timeBetween[2]);
            System.out.println("Time from Midnight: "+timeFromMidnight[0] + ":"+timeFromMidnight[1]+":"+timeFromMidnight[2]);

        }

    }
    private static long[] convertTime(long time) {
        final int HOUR_IN_SEC = 3600;
        final int MIN_IN_SEC = 60;
        return new long[]{(int)time/HOUR_IN_SEC, ((int)time%HOUR_IN_SEC)/MIN_IN_SEC, (int)time%MIN_IN_SEC};
    }
}
