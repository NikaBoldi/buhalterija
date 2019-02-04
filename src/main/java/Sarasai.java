import java.util.ArrayList;
import java.util.List;

public class Sarasai {

    private List<Imone> imones = new ArrayList<Imone>();
    private List<Tiekejas> tiekejai = new ArrayList<Tiekejas>();
    private List<Preke> prekes = new ArrayList<Preke>();
    private List<Saskaitos> saskaitos = new ArrayList<Saskaitos>();

    public void itraukiaIImoniuSarasa(long imonesKodas, long PVMKodas, String pavadinimas, String adresas, String telefonas) {
        imones.add(new Imone(imonesKodas, PVMKodas, pavadinimas, adresas, telefonas));
    }

    public void itraukiaITiekejuSarasa(long imonesKodas, long PVMKodas, String pavadinimas, String adresas, String telefonas) {
        tiekejai.add(new Tiekejas(imonesKodas, PVMKodas, pavadinimas, adresas, telefonas));
    }

    public void itraukiaIPrekiuSarasa(String knyga, double kaina) {
        prekes.add(new Preke(knyga, kaina));
    }

    public void itraukiaISaskaituSarasa(int saskNr) {
        saskaitos.add(new Saskaitos(saskNr));
    }

    public String surandaPrekePagalPavadinima (String pavadinimas){

        Preke laikinas = new Preke("pavadinimas",0);
        for (Preke preke: prekes) {
           if (preke.getPavadinimas()==pavadinimas) {
               return laikinas.toString(preke);
           }
        } return null;
    }

    public String surandaPrekePagalKaina (Double kaina){

        Preke laikinas = new Preke("pavadinimas",0);
        for (Preke preke: prekes) {
            if (preke.getKaina()==kaina) {
                return laikinas.toString(preke);
            }
        } return null;
    }

    public String surandaImonePagalPavadinima (String pavadinimas){

        Imone laikinas = new Imone(0,0,"","","");
        for (Imone imone: imones) {
            if (imone.getPavadinimas()==pavadinimas) {
                return laikinas.toString(imone);
            }
        } return null;
    }

    public String surandaImonePagalImonesKoda (Long imonesKodas){
        Imone laikinas = new Imone(0,0,"","","");
        for (Imone imone: imones) {
            if (imone.getImonesKodas()==imonesKodas) {
                return laikinas.toString(imone);
            }
        } return null;
    }

    public String surandaImonePagalImonesPVMKoda (Long PVMKodas){
        Imone laikinas = new Imone(0,0,"","","");
        for (Imone imone: imones) {
            if (imone.getPVMKodas()==PVMKodas) {
                return laikinas.toString(imone);
            }
        } return null;
    }

}
