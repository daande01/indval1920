package prog1indval_1920;

import javax.swing.JOptionPane;

public class upp26a {

	public static void main(String[] args) {


		String input =JOptionPane.showInputDialog("ange hur mycke pengar du vill ha");

		int belopp=Integer.parseInt(input);

		belopp= ((int)((belopp/100.0)+1))*100;



		    System.out.println(belopp);


	}



}
