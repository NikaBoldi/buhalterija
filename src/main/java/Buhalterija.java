public class Buhalterija {

	private Run begikas = new Run();
	private RunAndPrint spausdintuvas = null;

	private UIHandler ui;

	public Buhalterija(UIHandler ui) {
		this.ui = ui;
		spausdintuvas = new RunAndPrint(ui);
	}

	public void randaSkaiciu() {

		tikrina(ui.inputInt(
				" Spauskite 0, jei norite leisti programa be \"Print outo\" \n Spauskite 1, jei norite leisti programa su \"Print outu\" "));

	}

	public void tikrina(int choise) {
		if (choise == 0) {
			begikas.vykdo();
		} else if (choise == 1) {
			spausdintuvas.vykdo();
		} else {
			System.out.println("Ivedete neteisinga skaiciu");
			randaSkaiciu();
		}

	}

}
