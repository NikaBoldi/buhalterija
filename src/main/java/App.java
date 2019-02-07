import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Sarasai naujas = new Sarasai();
        Preke knyga = new Preke("Naujas", 90);
        Imone firm = new Imone ("ertre","","","","");
        Saskaitos sask = new Saskaitos(firm,0,"",knyga, 1);
        List<Preke> prekytes = new ArrayList<Preke>();

        naujas.itraukiaIPrekiuSarasa(knyga.getPavadinimas(),knyga.getKaina());
        naujas.itraukiaIPrekiuSarasa("Aldonis",45);
        naujas.itraukiaIPrekiuSarasa("Gegute",5.6);
        naujas.itraukiaIPrekiuSarasa("Aš ir tu, ir mes kartu",13.87);
        naujas.itraukiaIPrekiuSarasa("Preambule",9.99);
        naujas.itraukiaIPrekiuSarasa("1984",60);
        naujas.itraukiaIPrekiuSarasa("Vienetas aštuoniese",0.85);

        naujas.itraukiaIImoniuSarasa("345553455556654", "487658346573465", "Aleliuja", "Zemynos g. 45-76, Vilnius", " tel 83574588484");
        naujas.itraukiaITiekejuSarasa("75","56356334636","Neskolingas"," keistos gatves 67 namas", "8324");
        naujas.keiciaPrekesKaina(knyga,300);
        naujas.spausdinaSaskaita(firm,knyga,16);
        naujas.spausdinaSaskaita(firm,knyga,106);
        naujas.spausdinaSaskaita(firm,knyga,1600);
        sask = naujas.surandaSaskaitaPagalNr(1);
        prekytes = naujas.surandaPrekePagalPavadinima("");
        for (int i = 0; i< prekytes.size();i++){
            System.out.println(prekytes.get(i).toString(prekytes.get(i)));
            knyga = prekytes.get(i);
        }
  //      System.out.println(sask.toString(sask));


        naujas.salinaPreke(knyga);
        prekytes = naujas.surandaPrekePagalPavadinima("");
        System.out.println(prekytes.get(prekytes.size()-1).toString(prekytes.get(prekytes.size()-1)));

    }
}
