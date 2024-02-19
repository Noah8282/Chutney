package N6_objekters_state_13_02_2024;

public class Billetautomat {
    private int pris;
    private int saldo = 0;
    private int total = 0;

    public Billetautomat(int billetpris, int total) {
        pris = billetpris;
    }

    public int getPris() {
        return pris;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getTotal() {
        return total;
    }

    public void indbetal(int kroner) {
        if (kroner > 0) {
            saldo += kroner;
        } else {
            System.out.println("U broke. Indsæt positivt beløb.");
        }
    }

    public void printBillet() {
        if (saldo < pris) {
            System.out.println("Din saldo er ikke høj nok. Indsæt flere penge. Du mangler: "+(pris-saldo)+"kr på din saldo. Din saldo er: "+saldo+"kr. Billetprisen er: "+pris+"kr");
        } else {
            System.out.println("########################");
            System.out.println("### DSB røvdyr ###");
            System.out.println("########################");
            System.out.println("## Billet: " + pris + "kr. ##");
            System.out.println("########################");
            total += saldo;
            System.out.println("Du får "+(saldo-pris)+"kr tilbage.");
            saldo = 0;
        }
    }

}

