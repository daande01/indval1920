package prog1indval_1920;

import javax.swing.JOptionPane;

public class upp26b {

	public static void main(String[] args) {

		String input =JOptionPane.showInputDialog("ange hur mycke pengar du vill ha");

		int belopp=Integer.parseInt(input);

		belopp= ((int)((belopp/100.0)+1))*100;


		int antalfemhundra= belopp/500;

		int rest=belopp-(antalfemhundra*500);

		//int rest= belopp%500; alternativ till raden ovan


		int antalhundralappar=rest/100;


		System.out.println("uttag i 500-sedlar:"+antalfemhundra*500+"kr");

		System.out.println("uttag i 100-sedlar:"+antalhundralappar*100+"kr");

	}



}
