import java.lang.reflect.Array;

public class Preke extends Sarasai {

    protected String pavadinimas = "";
    protected double kaina = 0.0;

    public Preke(String pavadinimas, double kaina) {
        this.pavadinimas = pavadinimas;
        this.kaina = kaina;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public double getKaina() {
        return kaina;
    }

    public String toString(Preke preke) {
        return preke.pavadinimas + " " + Double.toString(preke.kaina) + " Eur";
    }
}
