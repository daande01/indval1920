package prog1indval_1920;

import javax.swing.JOptionPane;

public class Area {
	public static void main(String[] args) {


		String h�jd=JOptionPane.showInputDialog("ange hj�d");

		int h=Integer.parseInt(h�jd);

		String bas=JOptionPane.showInputDialog("ange bas");

		int b=Integer.parseInt(bas);



		int triarea= h*b/2;

		int kvadarea=h*b;

		JOptionPane.showMessageDialog(null, "triangel area:"+triarea+"kvadrat area"+kvadarea);


	}

}
