package prog1indval_1920;

import javax.swing.JOptionPane;

public class Area {
	public static void main(String[] args) {


		String höjd=JOptionPane.showInputDialog("ange hjöd");

		int h=Integer.parseInt(höjd);

		String bas=JOptionPane.showInputDialog("ange bas");

		int b=Integer.parseInt(bas);



		int triarea= h*b/2;

		int kvadarea=h*b;

		JOptionPane.showMessageDialog(null, "triangel area:"+triarea+"kvadrat area"+kvadarea);


	}

}
