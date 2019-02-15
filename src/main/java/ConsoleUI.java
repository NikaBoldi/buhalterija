import java.util.Scanner;

public class ConsoleUI implements UIHandler {

	private Scanner sc = new Scanner(System.in);

	@Override
	public void out(String param) {
		System.out.println(param);

	}

	@Override
	public String inputStr(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}

	@Override
	public int inputInt(String msg) {
		System.out.println(msg);
		return sc.nextInt();
	}

	@Override
	public void outEmpty() {
		System.out.println();

	}

}
