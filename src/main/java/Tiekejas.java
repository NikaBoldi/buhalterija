public class Tiekejas extends Sarasai{

    private String imonesKodas = "";
    private String PVMKodas = "";
    private String pavadinimas = "";
    private String adresas = "";
    private String telefonas = "";

    public Tiekejas(String imonesKodas, String PVMKodas, String pavadinimas, String adresas, String telefonas) {
        this.imonesKodas = imonesKodas;
        this.PVMKodas = PVMKodas;
        this.pavadinimas = pavadinimas;
        this.adresas = adresas;
        this.telefonas = telefonas;
    }

    public String toString (Tiekejas tiekejas){
        return tiekejas.pavadinimas +" Im. kodas"+ tiekejas.imonesKodas + ", "+ tiekejas.adresas +  ", PVM kodas "+tiekejas.PVMKodas + " tel.: "+tiekejas.telefonas;
    }
}
