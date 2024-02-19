package N10_git_introduktion_19_02_2024;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Hold {

    private Fodboldspiller[] spillerListe;
    int count = 0;

    public Hold() {
        this.spillerListe = new Fodboldspiller[3];
    }

    public void tilFøjSpiller(String fornavn, String efternavn, double højde, int vægt) {
        // count++ tæller én op og sikrer at næste spiller indsættes på næste indeksplads i arrayet
        spillerListe[count++] = new Fodboldspiller(fornavn, efternavn, højde, vægt);
    }

    public String beregnGennemsnitsHøjde() {

        //OPGAVE 2: Udskift den hardkodede værdi med en beregning.
        double sumOfHeight = 0;
        for(Fodboldspiller x : spillerListe) {
            sumOfHeight += x.getHøjde();
        }

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.UP);
        return df.format(sumOfHeight/spillerListe.length);

    }

}
