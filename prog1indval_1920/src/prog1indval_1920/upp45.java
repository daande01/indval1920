package prog1indval_1920;

import java.util.Scanner;

public class upp45 {







	public static void main(String[] args) {

		/*skapa scanner objekt
		 * skriv ut fr�ga
		 * l�sa in svar
		 * plocka ut t�ljare
		 * plocka ut n�mnare
		 *
		 *
		 *
		 *
		 */



		Scanner sc = new Scanner(System.in);


		System.out.println("mata in t�ljare och n�mnare :");

		String s =sc.nextLine();

		String t=s.substring(0,s.lastIndexOf(' '));
		String n=s.substring(s.lastIndexOf(' ')+1);

		int t�ljare= Integer.parseInt( t );

		int n�mnare=Integer.parseInt(n);

		System.out.println(t�ljare);
		System.out.println(n�mnare);

		int hela =  t�ljare/n�mnare;

		int rest =  t�ljare%n�mnare;


		System.out.println(hela+" "+rest+"/"+n�mnare );
		System.out.println(rest);

	}


}
