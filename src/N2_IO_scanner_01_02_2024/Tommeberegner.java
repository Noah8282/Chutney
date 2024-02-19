package N2_IO_scanner_01_02_2024;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tommeberegner {

    public static void main(String[] args) {
        //Scanner instance
        Scanner scanner = new Scanner(System.in);

        //definere variable for input af bruger (tommer).
        System.out.print("Venligst indtast de tommer der skal omregnes: ");
        double tommer = scanner.nextDouble();
        //Definere vatriable for input af bruger (enhed)
        System.out.print("Hvilken type vil du have omregnet til? Du kan besvare: mm, cm, m, foot, yard: ");
        String enhed = scanner.next();

        //Sætter rate for 1 tomme, ud fra hvilken enhed skal benyttes
        final double RATE = switch (enhed) {
            case "cm" -> 2.54;
            case "mm" -> 25.4;
            case "m" -> 0.254;
            case "foot" -> 0.083;
            case "yard" -> 0.028;
            default -> 0;
        };

        //Opretter formatering, så vi kun får 2 decimaler.
        DecimalFormat f = new DecimalFormat("##.00");
        //Omregner tommer til den ønskede enhed.
        String resultat = f.format(tommer*RATE);
        //Tjekker om raten er 0. Er den det, er det fordi brugeren ikke har brugt accepteret enhed.
        if (RATE != 0) {
            System.out.println("Du bad omregnes: " + tommer + " tommer til centimeter. Dette bliver til: " + resultat + enhed);
        } else {
            System.out.println("Du har ikke indtastet en valid omregningstype. Prøv venligst igen.");
        }
    }

}
