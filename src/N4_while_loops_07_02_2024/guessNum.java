package N4_while_loops_07_02_2024;

import java.util.Random;
import java.util.Scanner;

public class guessNum {
    public static void main(String[] args) {
        Random rn = new Random();
        int numberToGuess = rn.nextInt(1,11);
        int userGuess = -1;
        Scanner scanner = new Scanner(System.in);
        String message = null;
        while(!(numberToGuess == userGuess)) {


            if(userGuess != -1) {
                if(userGuess < numberToGuess) {
                    message =  "Tallet er større!";
                } else if(userGuess > numberToGuess) {
                    message =  "Tallet er mindre!";
                }
                System.out.println("Det var forkert! Prøv igen! " + message);
            } else {
                System.out.println("Gæt et tal imellem 1-10");
            }
            userGuess = scanner.nextInt();


        }

        System.out.println("Dit gæt var korrekt! Tallet er "+numberToGuess);

    }

}
