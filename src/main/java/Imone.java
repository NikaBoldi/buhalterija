public class Imone extends Sarasai{

    private String imonesKodas = "";
    private String PVMKodas = "";
    private String pavadinimas = "";
    private String adresas = "";
    private String telefonas = "";

    public Imone (String imonesKodas, String PVMKodas, String pavadinimas, String adresas, String telefonas){
        this.imonesKodas = imonesKodas;
        this.PVMKodas = PVMKodas;
        this.pavadinimas = pavadinimas;
        this.adresas = adresas;
        this.telefonas = telefonas;
    }

    public String getImonesKodas() {
        return imonesKodas;
    }

    public String getPVMKodas() {
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
        System.out.println(imone.pavadinimas +" Im. kodas"+ imone.imonesKodas + ", "+ imone.adresas +  ", PVM kodas "+imone.PVMKodas + " tel.: "+imone.telefonas);
        return imone.pavadinimas +" Im. kodas"+ imone.imonesKodas + ", "+ imone.adresas +  ", PVM kodas "+imone.PVMKodas + " tel.: "+imone.telefonas;
    }
}
