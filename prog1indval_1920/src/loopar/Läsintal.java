package loopar;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Läsintal {


	public static void main(String[] args) {


	int [] a = new int[5];

	int i =0;

	while (i<a.length) {

		a[i]=Integer.parseInt(JOptionPane.showInputDialog("ange ett tal"));

		i++;


	}

		System.out.println(Arrays.toString(a));



	}



}
