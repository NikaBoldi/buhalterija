import java.util.ArrayList;
import java.util.List;

public class Saskaitos {

    private String data;
    private Imone imone;
    private Preke preke;
    private double suma = 0;
    private int kiekis = 1;
    private List<Integer> numeriai = new ArrayList<>();

    public Saskaitos(Imone imone, int kiekis, String data, Preke preke, double suma) {
        this.data = data;
        this.imone = imone;
        this.preke = preke;
        this.kiekis = kiekis;
        this.suma = suma;
    }

    public String toString(Saskaitos saskaita) {
        return saskaita.imone.toString(imone) + " " + saskaita.preke.toString(preke) + " " + " data " + Integer.toString(kiekis) + Double.toString(saskaita.suma) + " Eur";
    }

    public String getData() {
        return data;
    }

    public Imone getImone() {
        return imone;
    }

    public Preke getPreke() {
        return preke;
    }

    public double getSuma() {
        return suma;
    }

    public int getKiekis() {
        return kiekis;
    }

    public List<Integer> getNumeriai() {
        return numeriai;
    }
}
