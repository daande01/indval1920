package prog1indval_1920;

import javax.swing.JOptionPane;

public class Ovn76 {

	public static void main(String[] args) {

		String santal = JOptionPane.showInputDialog("ange antal:");

		int antal = Integer.parseInt(santal);

		double rabatt = 1;

		if (antal > 10 && antal <= 50) {

			rabatt = 0.95;
		} else if (antal > 50 && antal <= 100) {

			rabatt = 0.90;
		} else if (antal > 100) {

			rabatt = 0.85;

		}

		System.out.println(antal * 9.9 * rabatt);

	}

}
