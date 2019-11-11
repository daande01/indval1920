package prog1indval_1920;

import javax.swing.JOptionPane;

public class ovn25 {
public static void main(String[] args) {

	String namn=JOptionPane.showInputDialog("ange för och efternamn separerat av mellansalg");

	namn=namn.trim();


	char förstabokstaven = namn.charAt(0);

	int lastspace =namn.lastIndexOf(' ');

	char andrainitisialen=namn.charAt(lastspace+1);

	System.out.println(förstabokstaven+" "+andrainitisialen);

}
}
