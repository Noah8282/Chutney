package N3_betingelser_og_beslutninger_02_02_2024;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Porto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Indtast vægten på brevet i gram: ");
        double weight = scanner.nextDouble();
        double price;
        String message;
        if (weight <= 0 || weight > 2000) {
            message = "Et brev med denne vægt kan vi ikke sende.";
        } else {
            if (weight <= 100) {
                price = 25;
            } else if (weight >= 500) {
                price = 75;
            } else {
                price = Math.round(((-0.0002 * Math.pow(weight, 2)) + (0.225 * weight) + 4.1667) / 10) * 10;
            }
            DecimalFormat f = new DecimalFormat("##");
            String formattedPrice = f.format(price);
            message = "Porto for et brev med vægt " + weight + "g er på: " + formattedPrice;
        }
        System.out.println(message);

    }
}