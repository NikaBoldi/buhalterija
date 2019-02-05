public class App {
    public static void main(String[] args) {

        Sarasai naujas = new Sarasai();
        Preke knyga = new Preke("Naujas", 90);



        naujas.itraukiaIPrekiuSarasa("Aldonis",45);
        naujas.itraukiaIPrekiuSarasa("Gegute",5.6);
        naujas.itraukiaIPrekiuSarasa("Aš ir tu, ir mes kartu",13.87);
        naujas.itraukiaIPrekiuSarasa("Preambule",9.99);
        naujas.itraukiaIPrekiuSarasa("1984",60);
        naujas.itraukiaIPrekiuSarasa("Vienetas aštuoniese",0.85);

        naujas.itraukiaIImoniuSarasa("345553455556654", "487658346573465", "Aleliuja", "Zemynos g. 45-76, Vilnius", " tel 83574588484");
        naujas.itraukiaITiekejuSarasa("75","56356334636","Neskolingas"," keistos gatves 67 namas", "8324");

      //  System.out.println(naujas.surandaPrekePagalKaina(5.6));

        naujas.spausdinaSaskaita("ut");


    }
}
