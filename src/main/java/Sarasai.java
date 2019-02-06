import java.sql.SQLOutput;
import java.util.*;

public class Sarasai {

    private List<Imone> imones = new ArrayList<Imone>();
    private List<Tiekejas> tiekejai = new ArrayList<Tiekejas>();
    private List<Preke> prekes = new ArrayList<Preke>();
    private Map<Integer,Saskaitos> saskaitos = new HashMap <Integer, Saskaitos>();
    private List<Preke> prekiuSarasas = new ArrayList<Preke>();
    private List<Imone> imoniuSarasas = new ArrayList<Imone>();
    private int saskaitosNr =0;

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

    public List surandaPrekePagalPavadinima (String pavadinimas){
        for (Preke preke: prekes) {
           if (preke.getPavadinimas().contains(pavadinimas)) {
               prekiuSarasas.add(preke);
           }
        }return prekiuSarasas;
    }

    public List surandaPrekePagalKaina (double kaina){
        for (Preke preke: prekes) {
            if (preke.getKaina() == kaina) {
                prekiuSarasas.add(preke);
            }
        }return prekiuSarasas;
    }

    public List surandaImonePagalPavadinima (String pavadinimas){
        for (Imone imone: imones) {
            if (imone.getPavadinimas().contains(pavadinimas)) {
                imoniuSarasas.add(imone);
            }
        } return imoniuSarasas;
    }

    public List surandaImonePagalImonesKoda (String imonesKodas){
         for (Imone imone: imones) {
            if (imone.getImonesKodas().contains(imonesKodas)) {
                imoniuSarasas.add(imone);
            }
         } return imoniuSarasas;
    }

    public List surandaImonePagalImonesPVMKoda (String PVMKodas){
         for (Imone imone: imones) {
            if (imone.getPVMKodas().contains(PVMKodas)) {
                imoniuSarasas.add(imone);
            }
         } return imoniuSarasas;
    }

    public double prekesKaina (String pavadinimas){
        for (Preke preke: prekes) {
            if (preke.getPavadinimas().contains(pavadinimas)) {
                return preke.getKaina();
            }return 0;
        } return 0;
    }

    public void spausdinaSaskaita (Imone imone, Preke preke, int kiekis){

        imone.getPavadinimas();
        imone.getImonesKodas();
        imone.getPVMKodas();
        imone.getAdresas();
        preke.getPavadinimas();
        preke.getKaina();

        double suma = kiekis * preke.getKaina();
        itraukiaISaskaituSarasa(saskaitosNr++, new Saskaitos(imone,kiekis,"",preke));
    }
}
