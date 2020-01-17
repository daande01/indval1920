package loopar;

import javax.swing.JOptionPane;

public class ovn87 {

	public static void main(String[] args) {

		int i  = 0;

		while (i==0) {

			String räkneSätt = JOptionPane.showInputDialog("ange räknesätt");
			double tal1 = Double.parseDouble(JOptionPane.showInputDialog("ange ett tal"));
			double tal2 = Double.parseDouble(JOptionPane.showInputDialog("ange ett tal"));
			double svar = 0;

			if (räkneSätt.equals("*")) {

				svar = tal1 * tal2;

			} else if (räkneSätt.equals("-")) {
				svar = tal1 - tal2;
			} else if (räkneSätt.equals("+")) {
				svar = tal1 + tal2;
			} else if (räkneSätt.equals("/")) {
				svar = tal1 / tal2;

			}

			System.out.println("svaret blir:" + svar);

			  i = JOptionPane.showConfirmDialog(null, "vill du fortsätta");

		}

	}

}
