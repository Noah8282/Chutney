package N4_while_loops_07_02_2024;

import java.util.Scanner;

public class Sentinel {

    public static void main(String[] args) {
        final int SENTINEL = -1;
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        double input = 0;
        System.out.print("Indsæt det tal, du gerne vil have lagt sammen. Skriv -1 for at stoppe: ");
        while((int)input != SENTINEL) {
            input = scanner.nextDouble();
            sum += (input != -1) ? input : 0;
            System.out.println("Dit totale lægger på: "+sum);

        }
        System.out.println("Dit totale endte med at være: "+sum);

    }




}
