import java.util.ArrayList;
import java.util.List;

public class Imone extends Sarasai{

    private long imonesKodas = 0;
    private long PVMKodas = 0;
    private String pavadinimas = "";
    private String adresas = "";
    private String telefonas = "";

    public Imone (long imonesKodas, long PVMKodas, String pavadinimas, String adresas, String telefonas){
        this.imonesKodas = imonesKodas;
        this.PVMKodas = PVMKodas;
        this.pavadinimas = pavadinimas;
        this.adresas = adresas;
        this.telefonas = telefonas;
    }

    public long getImonesKodas() {
        return imonesKodas;
    }

    public long getPVMKodas() {
        return PVMKodas;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public String getAdresas() {
        return adresas;
    }

    public String getTelefonas() {
        return telefonas;
    }

    public String toString (Imone imone){
        return imone.pavadinimas +" Im. kodas"+ Long.toString(imone.imonesKodas) + ", "+ imone.adresas +  ", PVM kodas "+Long.toString(imone.PVMKodas) + " tel.: "+imone.telefonas;
    }
}
