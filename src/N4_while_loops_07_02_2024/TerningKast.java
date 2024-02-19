package N4_while_loops_07_02_2024;

import java.util.Random;

public class TerningKast {

    public static void main(String[] args) {
        Random rn = new Random();
        int terning1;
        int terning2;
        int sum = 0;

        while(!(sum == 7)) {
            terning1 = rn.nextInt(1,7);
            terning2 = rn.nextInt(1,7);
            sum = terning1 + terning2;

            System.out.println(terning1 + " + "+ terning2 + " = " + sum);


        }
        System.out.println("We hit 7!");
    }
}
