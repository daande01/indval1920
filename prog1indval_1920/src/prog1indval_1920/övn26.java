package prog1indval_1920;

import javax.swing.JOptionPane;

public class �vn26 {

	public static void main(String[] args) {

		String namn=JOptionPane.showInputDialog("ange f�r och efternamn separerat av \n mellansalg");


		int space=namn.indexOf(' ');

		String fnamn=namn.substring(0, space);

		String enamn=namn.substring(space);


		System.out.println(fnamn +"\n" +enamn);



	}

}
