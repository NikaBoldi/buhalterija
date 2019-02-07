public class Saskaitos extends Sarasai{

    private int saskaitosNr = 0;
    private String data;
    private Imone imone;
    private Preke preke;
    private double suma = 0;
    private int kiekis = 1;

    public Saskaitos(Imone imone, int kiekis, String data, Preke preke, double suma) {
        this.saskaitosNr = ++saskaitosNr;
        this.data = data;
        this.imone = imone;
        this.preke = preke;
        this.kiekis = kiekis;
        this.suma = suma;
    }

    public String toString(Saskaitos saskaita) {
        return saskaita.imone.toString(imone) + " " + saskaita.preke.toString(preke) + " " + " data " + Integer.toString(kiekis) + Double.toString(saskaita.suma) + " Eur";
    }
}
