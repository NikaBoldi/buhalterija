import java.util.ArrayList;
import java.util.List;

public class RunAndPrint {

    public void vykdo() {
        Sarasai naujas = new Sarasai();
        Preke knyga = new Preke("Naujas", 90);
        Imone firm = new Imone("0000000", "00000000", "fintai", "", "");
        List<Preke> prekytes = new ArrayList<Preke>();

        naujas.itraukiaIPrekiuSarasa(knyga.getPavadinimas(), knyga.getKaina());
        naujas.itraukiaIPrekiuSarasa("hahahahaha", 45);
        naujas.itraukiaIPrekiuSarasa("Gegute", 5.6);
        naujas.itraukiaIPrekiuSarasa("As ir tu, ir mes kartu", 13.87);
        naujas.itraukiaIPrekiuSarasa("Preambule", 9.99);
        naujas.itraukiaIPrekiuSarasa("1984", 60);
        naujas.itraukiaIPrekiuSarasa("Vienetas astuoniese", 0.85);

        naujas.itraukiaIImoniuSarasa("345553455556654", "487658346573465", "Algebra", "Zemynos g. 45-76, Vilnius", " tel 83574588484");
        naujas.itraukiaITiekejuSarasa("75", "56356334636", "Neskolingas", " keistos gatves 67 namas", "8324");

        naujas.keiciaPrekesKaina(knyga, 300);

        naujas.spausdinaSaskaita(firm, knyga, 16);
        firm = new Imone("5345435", "45778687686", "Turbo diena", "Veju 7878-9;", "456456456");
        naujas.spausdinaSaskaita(firm, knyga, 106);
        naujas.spausdinaSaskaita(firm, knyga, 1600);

        prekytes = naujas.surandaPrekePagalPavadinima("");
        for (int i = 0; i < prekytes.size(); i++) {
            System.out.println(prekytes.get(i).toString(prekytes.get(i)));
            knyga = prekytes.get(i);
        }

        System.out.println();
        naujas.salinaPreke(knyga);
        System.out.println(prekytes.get(prekytes.size() - 1).toString(prekytes.get(prekytes.size() - 1)));
        System.out.println();

        for (int i = 1; i <= naujas.saskaitos.size(); i++) {
            System.out.println("sask. nr. " + i + " " + naujas.surandaSaskaitaPagalNr(i).toString(naujas.surandaSaskaitaPagalNr(i)));
        }

        naujas.keiciaSaskaita(1, 44440, 50, firm, knyga);
        System.out.println();
        for (int i = 1; i <= naujas.saskaitos.size(); i++) {
            System.out.println("sask. nr. " + i + " " + naujas.surandaSaskaitaPagalNr(i).toString(naujas.surandaSaskaitaPagalNr(i)));
        }
    }
}
