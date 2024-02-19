package N7_instans_metoder_og_statiske_metoder_14_02_2024.Hilsen_Instans_Med_Constructor;

public class Hilsen {
    private String name;

    public Hilsen(String name) {
        this.name = name;

    }
    public void hej() {
        System.out.println("Hej, mit navn er "+name+"!");
    }
}