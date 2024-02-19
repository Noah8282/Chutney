package N5_for_loops_og_arrays_08_02_2024;

public class ForLoops {

    public static void main(String[] args) {

        //Printer 2 gange x = x
        for (int i = 1; i <= 4; i++) {
            System.out.println("2 gange "+i+" = "+(2*i));
        }
        System.out.println();

        //printer talrække:  2  4  6  8  10  12
        for (int i = 2; i <= 12; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println();

        //printer talrække: 4  19  34  49  64  79
        for (int i = 4; i <= 79; i+=15) {
            System.out.print(i + " ");
        }
        System.out.println();

        //printer talrække: 30  20  10  0 -10  -20
        for (int i = 30; i >= -20; i-=10) {
            System.out.print(i + " ");
        }
        System.out.println();

        //printer talrække: -7  -3  1  5  9  13
        for (int i = -7; i <=13 ; i+=4) {
            System.out.print(i + " ");
        }
        System.out.println();

        //printer talrække: 97  94  91  88  85  82
        for (int i = 97; i >=82 ; i-=3) {
            System.out.print(i + " ");
        }
    }
}
