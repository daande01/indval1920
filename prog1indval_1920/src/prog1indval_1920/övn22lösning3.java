package prog1indval_1920;

import javax.swing.JOptionPane;

public class övn22lösning3 {

	public static void main(String[] args) {


		String tal=JOptionPane.showInputDialog("ange ett tal");

		double d = Double.parseDouble(tal);

		double svar =  Math.pow(d, 2);

		JOptionPane.showMessageDialog(null,svar);


	}

}
