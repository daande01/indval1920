package prog1indval_1920;

import javax.swing.JOptionPane;

public class ovn78 {

	public static void main(String[] args) {


	String s1 = JOptionPane.showInputDialog("namn s1");
	String s2 = JOptionPane.showInputDialog("namn s2");



	int i = s1.compareToIgnoreCase(s2);

	System.out.println(i);
	if (i==0) {


			System.out.println("samma ord");

	}else if (i<0) {

			System.out.println(s1+"    "+s2);


	}else {
		System.out.println(s2+"    "+s1);

	}



	}

}
