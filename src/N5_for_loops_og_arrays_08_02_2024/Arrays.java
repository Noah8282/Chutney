package N5_for_loops_og_arrays_08_02_2024;

import java.sql.Array;

public class Arrays {

    public static void main(String[] args) {

        //Del 1: Lav array med 8 index og angiv Index 0: 34 + Index 7: 117. Print dette
        int[] numArray = new int[8];
        numArray[0] = 34;
        numArray[7] = 117;

        for(int x : numArray) {
            System.out.println(x);
        }

        //Del 2: Lav array med ord og print med for loop med et mellemrum.
        String[] stringArray = {"Hej", "med", "dig"};

        for (String x : stringArray) {
            System.out.print(x + " ");
        }
        System.out.println();
        //Del 3: Lav array med doubles og print værdierne på index 2. Array længden skal også udskrives. Hvad sker der, hvis index 4 printes?

        double[] doubleArray = {3.4, 2.5, 1.2, 6.7};
        System.out.println(doubleArray[2]); //Printer index plads 2
        System.out.println(doubleArray.length); //Printer længden af array
        System.out.println(doubleArray[4]); //Forsøger at printe index plads 4. Kan ikke lade sig gøre, da denne ikke er angivet. Array går fra 0-3. 0 tæller med!. Et index med 4 ville have 5 værdier.


    }
}
