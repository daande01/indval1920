package arrayer;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Upp31 {

	public static void main(String[] args) {

		double[] d = new double[3];

		String tal = JOptionPane.showInputDialog("ange ett tal");

		d[0] = Double.parseDouble(tal);

		 tal = JOptionPane.showInputDialog("ange ett tal");

		d[1] = Double.parseDouble(tal);

		tal=JOptionPane.showInputDialog("ange ett tal");

		d[2]=Double.parseDouble(tal);

		System.out.print(Arrays.toString(d));

		   double summa=d[0]+d[1]+d[2];

		   double medelVärde=summa /3;

		   System.out.println("summa:"+summa+"\n medelvärde:"+medelVärde);


	}

}
