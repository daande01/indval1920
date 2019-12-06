package prog1indval_1920;

import javax.swing.JOptionPane;

public class Ovn71 {

	public static void main(String[] args) {

		/*
		 * läs in ålder i variabel age (String) omvandla till in med pars. if (ålder
		 * överstiger 12 år) du får delta. else du får inte delta
		 *
		 */

		String sage = JOptionPane.showInputDialog("ange ålder");

		int age = Integer.parseInt(sage);

		if (age >= 12 && age<100) {
			System.out.println("ok");

		} else  if (age < 12 && age>=0) {

			System.out.println("inte ok");
		}

	}

}
