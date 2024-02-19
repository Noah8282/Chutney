package N5_objekter_og_klasser_12_02_2024;

import java.util.Random;

public class Terning {
    final int MAX = 6;
    int faceValue;
    Random random;

    public Terning() {
        random = new Random();
    }


    public int roll() {
        faceValue = random.nextInt(1,MAX+1);
        return faceValue;
    }

}

