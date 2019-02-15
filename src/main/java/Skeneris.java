import java.util.Scanner;

public class Skeneris {

    Run begikas = new Run();
    RunAndPrint spausdintuvas = new RunAndPrint();

    public void randaSkaiciu (){
        System.out.println(" Spauskite 0, jei norite leisti programa be \"Print outo\" \n Spauskite 1, jei norite leisti programa su \"Print outu\" ");
        Scanner scanner = new Scanner(System.in);
        int choise = scanner.nextInt();
        tikrina(choise);
    }

    public void tikrina (int choise){
        if (choise == 0){ begikas.vykdo();}
        else if (choise == 1){ spausdintuvas.vykdo();}
        else {
            System.out.println("Ivedete neteisinga skaiciu");
            randaSkaiciu();
        }

    }

}
