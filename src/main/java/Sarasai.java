import java.sql.SQLOutput;
import java.util.*;

public class Sarasai {

    protected List<Imone> imones = new ArrayList<Imone>();
    protected List<Tiekejas> tiekejai = new ArrayList<Tiekejas>();
    protected List<Preke> prekes = new ArrayList<Preke>();
    protected Map<Integer,Saskaitos> saskaitos = new HashMap <Integer, Saskaitos>();
    protected List<Preke> prekiuSarasas = new ArrayList<Preke>();
    protected List<Imone> imoniuSarasas = new ArrayList<Imone>();
    protected int saskaitosNr =0;

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

        itraukiaIPrekiuSarasa("1984",60);
        itraukiaIPrekiuSarasa("Vienetas astuoniese",0.85);

        for (Preke preke: prekes) {
            if (preke.getKaina() == kaina) {
                prekiuSarasas.add(preke);
            }
        }return prekiuSarasas;
    }

   public Preke keiciaPrekesKaina (Preke preke, double naujaKaina){
        int counter =0;
           for (int i = 0; i< prekes.size();i++) {
               if (!prekes.get(i).equals(preke)) {
                   counter++;
               } break;
           }
           Preke good = new Preke(preke.getPavadinimas(),naujaKaina);
       if (prekiuSarasas.contains(preke)){
           prekiuSarasas.set(counter-1,good);
       }
        return prekes.set(counter-1,good);
   }

    public void salinaPreke (Preke preke){
        prekes.remove(preke);
        if (prekiuSarasas.contains(preke)){
            prekiuSarasas.remove(preke);
        }
    }

    public Saskaitos keiciaSaskaita (int saskNr, double naujaKaina, int naujasKiekis, Imone naujaImone, Preke naujaPreke){
        Saskaitos laikina = new Saskaitos(naujaImone,naujasKiekis,"",naujaPreke, naujaKaina*naujasKiekis);
        saskaitos.put(saskNr,laikina);
       return laikina;
    }

    public void salinaSaskaita (Saskaitos saskaita){
        saskaitos.remove(saskaita);
    }

    public Saskaitos surandaSaskaitaPagalNr (int saskNr){
         return   saskaitos.get(saskNr);
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

    public void spausdinaSaskaita (Imone imone, Preke preke, int kiekis){

        imone.getPavadinimas();
        imone.getImonesKodas();
        imone.getPVMKodas();
        imone.getAdresas();
        preke.getPavadinimas();
        preke.getKaina();

        double suma = kiekis * preke.getKaina();
            itraukiaISaskaituSarasa(++saskaitosNr, new Saskaitos(imone,kiekis,"",preke, suma));
    }
}
