package prog1indval_1920;

import javax.swing.JOptionPane;

public class Ovn71 {

	public static void main(String[] args) {

		/*
		 * l�s in �lder i variabel age (String) omvandla till in med pars. if (�lder
		 * �verstiger 12 �r) du f�r delta. else du f�r inte delta
		 *
		 */

		String sage = JOptionPane.showInputDialog("ange �lder");

		int age = Integer.parseInt(sage);

		if (age >= 12 && age<100) {
			System.out.println("ok");

		} else  if (age < 12 && age>=0) {

			System.out.println("inte ok");
		}

	}

}
