import java.util.ArrayList;
import java.util.List;

public class Run {

    public void vykdo() {
        Sarasai naujas = new Sarasai();
        Preke knyga = new Preke("", 90);
        Imone firm = new Imone("", "", "", "", "");
        List<Preke> prekytes = new ArrayList<Preke>();

        naujas.itraukiaIPrekiuSarasa(knyga.getPavadinimas(), knyga.getKaina());

        naujas.itraukiaIImoniuSarasa("", "", "", "", "");
        naujas.itraukiaITiekejuSarasa("", "", "", "", "");

        naujas.keiciaPrekesKaina(knyga, 300);

        firm = new Imone("", "", "", "", "");

        prekytes = naujas.surandaPrekePagalPavadinima("");
        for (int i = 0; i < prekytes.size(); i++) {
            knyga = prekytes.get(i);
        }
        naujas.salinaPreke(knyga);
        naujas.keiciaSaskaita(1, 1, 1, firm, knyga);
    }
}
