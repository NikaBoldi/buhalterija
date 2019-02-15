import java.util.Scanner;

import javax.swing.JOptionPane;

public class SwingUI implements UIHandler {

	@Override
	public void out(String param) {
		JOptionPane.showMessageDialog(null, param);
	}

	@Override
	public String inputStr(String msg) {
		return JOptionPane.showInputDialog(msg);
	}

	@Override
	public int inputInt(String msg) {

		String aaa = JOptionPane.showInputDialog(msg);

		return Integer.parseInt(aaa);
	}

	@Override
	public void outEmpty() {

	}

}
