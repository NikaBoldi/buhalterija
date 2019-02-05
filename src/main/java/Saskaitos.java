public class Saskaitos extends Sarasai{

    private int saskaitosNr = 0;
    private String data;
    private Imone imone;
    private Preke preke;
    private int kiekis = 1;

    public Saskaitos(Imone imone, int kiekis, String data, Preke preke) {
        this.saskaitosNr = ++saskaitosNr;
        this.data = data;
        this.imone = imone;
        this.preke = preke;
        this.kiekis = kiekis;
    }
}
