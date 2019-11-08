package prog1indval_1920;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ovn24 {

		public static void main(String[] args) {

			String s=JOptionPane.showInputDialog("ange tal separera med mellanslag");


			String [] sarray = new String[10];

			for (int i = 0; i < 20; i=i+2) {


				sarray[i/2]=String.valueOf(s.charAt(i));


			}

			System.out.println(Arrays.toString(sarray));

		}
}
