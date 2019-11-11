package prog1indval_1920;

import javax.swing.JOptionPane;

public class uppreplacestring {

	public static void main(String[] args) {


		String namn=JOptionPane.showInputDialog("ange för och efternamn separerat av \n mellansalg");


		namn=namn.replace('a', 'd');

		namn=namn.toUpperCase();


		System.out.println(namn);

	}



}
