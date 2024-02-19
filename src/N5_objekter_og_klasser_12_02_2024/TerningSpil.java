package N5_objekter_og_klasser_12_02_2024;

public class TerningSpil {

    public static void main(String[] args) {
        Terning terning1 = new Terning();
        Terning terning2 = new Terning();
        int roll1 = 0;
        int roll2 = 0;

        while(!(roll1 == 1 && roll2 == 1)) {
            roll1 = terning1.roll();
            roll2 = terning2.roll();
            System.out.println(""+roll1+roll2);

            if((roll1 == 1 && roll2 == 1)) {
                System.out.println("Snake eyes!");
                System.out.println("Good game");
            }

        }
    }

}
