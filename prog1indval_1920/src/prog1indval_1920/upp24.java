package prog1indval_1920;

import javax.swing.JOptionPane;

public class upp24 {

	public static void main(String[] args) {


	String stal= JOptionPane.showInputDialog("ange ett tal som skall omvandlas till en char");

	int tal = Integer.parseInt(stal);


	char c = (char) tal;

	JOptionPane.showMessageDialog(null, c);




}
}
