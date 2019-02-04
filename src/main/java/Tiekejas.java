public class Tiekejas extends Sarasai{

    private long imonesKodas = 0;
    private long PVMKodas = 0;
    private String pavadinimas = "";
    private String adresas = "";
    private String telefonas = "";

    public Tiekejas(long imonesKodas, long PVMKodas, String pavadinimas, String adresas, String telefonas) {
        this.imonesKodas = imonesKodas;
        this.PVMKodas = PVMKodas;
        this.pavadinimas = pavadinimas;
        this.adresas = adresas;
        this.telefonas = telefonas;
    }
}
