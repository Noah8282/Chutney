package N5_objekter_og_klasser_12_02_2024;

public class Beregning {

    public static void main(String[] args) {
        Regnemaskine rm = new Regnemaskine(10,54);

        System.out.println(rm.addition());
        rm.x = 24;
        rm.y = 7.5;
        System.out.println(rm.addition());


    }
}

