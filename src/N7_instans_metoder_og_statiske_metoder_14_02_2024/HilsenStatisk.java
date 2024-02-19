package N7_instans_metoder_og_statiske_metoder_14_02_2024;

public class HilsenStatisk {

    public static void main(String[] args) {
        System.out.println(hej("Noah"));
        System.out.println(hej("Signe"));
        System.out.println(hej("Mikkel"));
        System.out.println(hej("Esra"));
        System.out.println(hej("Luna"));
    }

    public static String hej(String name) {
        return "Hej "+name+"!";
    }
}
