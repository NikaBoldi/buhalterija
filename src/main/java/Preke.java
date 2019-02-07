import java.lang.reflect.Array;

public class Preke extends Sarasai {

    private String pavadinimas = "";
    private int kiekis = 0;
    private double kaina = 0.0;

    public Preke(String pavadinimas, double kaina) {
        this.pavadinimas = pavadinimas;
        this.kiekis = kiekis;
        this.kaina = kaina;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public int getKiekis() {
        return kiekis;
    }

    public double getKaina() {
        return kaina;
    }

    public String toString(Preke preke) {
        return preke.pavadinimas + " " + Double.toString(preke.kaina) + " Eur";
    }
}
