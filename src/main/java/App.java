public class App {
    public static void main(String[] args) {

        Sarasai naujas = new Sarasai();

        naujas.itraukiaIPrekiuSarasa("Aldonis",45);
        naujas.itraukiaIPrekiuSarasa("Gegute",5.6);
        naujas.itraukiaIPrekiuSarasa("Aš ir tu, ir mes kartu",13.87);
        naujas.itraukiaIPrekiuSarasa("Preambule",9.99);
        naujas.itraukiaIPrekiuSarasa("1984",60);
        naujas.itraukiaIPrekiuSarasa("Vienetas aštuoniese",0.85);

        naujas.itraukiaIImoniuSarasa(345553455556654L, 487658346573465L, "Aleliuja", "Zemynos g. 45-76, Vilnius", " tel 83574588484");

        naujas.itraukiaITiekejuSarasa(75,56356334636L,"Neskolingas"," keistos gatves 67 namas", "8324");
     //   System.out.println(naujas.surandaPrekePagalPavadinima("Vienetas aštuoniese"));
      //  System.out.println(naujas.surandaPrekePagalKaina(5.6));
        System.out.println(naujas.surandaImonePagalImonesKoda(345553455556654L));
    }
}
