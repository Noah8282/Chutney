package N6_objekters_state_13_02_2024;

import java.util.Random;

public class BilletAutomatDemo {

    public static void main(String[] args) {
        Random rn = new Random();
        Billetautomat automat1 = new Billetautomat(100,100);
        Billetautomat automat2 = new Billetautomat(300, 100);

        System.out.println(automat1.getPris());
        automat1.indbetal(rn.nextInt(1,1001));
        automat1.printBillet();

        automat2.indbetal(rn.nextInt(1,1001));
        automat2.printBillet();

    }

}
