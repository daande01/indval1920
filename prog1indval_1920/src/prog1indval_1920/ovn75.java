package prog1indval_1920;

import javax.swing.JOptionPane;

public class ovn75 {

	public static void main(String[] args) {


		String sl�ngd = JOptionPane.showInputDialog("ange l�ngd:");

		double l�ngdtal = Double.parseDouble(sl�ngd);

		String svind=JOptionPane.showInputDialog("ange vind:");

		double vindtal=Double.parseDouble(svind);


		if (vindtal<=2 && l�ngdtal > 7.92 ) {

			JOptionPane.showMessageDialog(null, "grattis du �r ny klubbm�stare");

		}else {

			JOptionPane.showMessageDialog(null, "looser");
		}


	}


}
