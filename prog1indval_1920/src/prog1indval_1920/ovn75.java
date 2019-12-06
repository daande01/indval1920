package prog1indval_1920;

import javax.swing.JOptionPane;

public class ovn75 {

	public static void main(String[] args) {


		String slängd = JOptionPane.showInputDialog("ange längd:");

		double längdtal = Double.parseDouble(slängd);

		String svind=JOptionPane.showInputDialog("ange vind:");

		double vindtal=Double.parseDouble(svind);


		if (vindtal<=2 && längdtal > 7.92 ) {

			JOptionPane.showMessageDialog(null, "grattis du är ny klubbmästare");

		}else {

			JOptionPane.showMessageDialog(null, "looser");
		}


	}


}
