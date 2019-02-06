import java.sql.SQLOutput;
import java.util.*;

public class Sarasai {

    private List<Imone> imones = new ArrayList<Imone>();
    private List<Tiekejas> tiekejai = new ArrayList<Tiekejas>();
    private List<Preke> prekes = new ArrayList<Preke>();
    private Map<Integer,Saskaitos> saskaitos = new HashMap <Integer, Saskaitos>();
    private int kiekis = 1;

    public void itraukiaIImoniuSarasa(String imonesKodas, String PVMKodas, String pavadinimas, String adresas, String telefonas) {
        imones.add(new Imone(imonesKodas, PVMKodas, pavadinimas, adresas, telefonas));
    }

    public void itraukiaITiekejuSarasa(String imonesKodas, String PVMKodas, String pavadinimas, String adresas, String telefonas) {
        tiekejai.add(new Tiekejas(imonesKodas, PVMKodas, pavadinimas, adresas, telefonas));
    }

    public void itraukiaIPrekiuSarasa(String knyga, double kaina) {
        prekes.add(new Preke(knyga, kaina));
    }

    public void itraukiaISaskaituSarasa(int saskNr, Saskaitos saskaita) {
        saskaitos.put(saskNr,saskaita);
    }

    public Preke surandaPrekePagalPavadinima (String pavadinimas){

        Preke laikinas = new Preke("",0);
        for (Preke preke: prekes) {
           if (preke.getPavadinimas().contains(pavadinimas)) {
               return laikinas;
           }
        } return null;
    }

    public Preke surandaPrekePagalKaina (Double kaina){

        Preke laikinas = new Preke("",0);
        for (Preke preke: prekes) {
            if (preke.getKaina()==kaina) {
                return laikinas;
            }
        } return null;
    }

    public Imone surandaImonePagalPavadinima (String pavadinimas){

        Imone laikinas = new Imone("","","","","");
        for (Imone imone: imones) {
            if (imone.getPavadinimas().contains(pavadinimas)) {
                return laikinas;
            }
        } return null;
    }

    public Imone surandaImonePagalImonesKoda (String imonesKodas){
        Imone laikinas = new Imone("","","","","");
        for (Imone imone: imones) {
            if (imone.getImonesKodas().contains(imonesKodas)) {
                return laikinas;
            }
        } return null;
    }

    public Imone surandaImonePagalImonesPVMKoda (String PVMKodas){
        Imone laikinas = new Imone("","","","","");
        for (Imone imone: imones) {
            if (imone.getPVMKodas().contains(PVMKodas)) {
                return laikinas;
            }
        } return null;
    }

    public void randaSaskaitaSarase(int saskNr) {
        saskaitos.get(saskNr);
    }

    public double prekesKaina (String pavadinimas){
        int counter=0;
        for (Preke preke: prekes) {
            counter++;
            if (preke.getPavadinimas().contains(pavadinimas)) {
                return preke.kaina;
            }return 0;
        } return 0;

    }

    public void spausdinaSaskaita (String pavadinimas){

        Sarasai pateikejas = new Sarasai();
        Imone pirkejas = pateikejas.surandaImonePagalPavadinima(pavadinimas);
        Preke knyga = pateikejas.surandaPrekePagalPavadinima(pavadinimas);


        double suma = kiekis * prekesKaina(pavadinimas);
        System.out.println(suma );
    }
}
