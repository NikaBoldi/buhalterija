public class Saskaitos extends Sarasai{

    private int saskaitosNr = 0;
    private String data;
    private Imone imone;
    private Preke preke;

    public Saskaitos(int saskaitosNr ) {
        this.saskaitosNr = ++saskaitosNr;
    }

    public double skaiciuojaSuma (int kiekis, double kaina){
        return kiekis*kaina;
    }

    public void surandaSaskaita (){

    }
}
