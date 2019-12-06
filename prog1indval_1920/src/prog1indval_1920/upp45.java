package prog1indval_1920;

import java.util.Scanner;

public class upp45 {







	public static void main(String[] args) {

		/*skapa scanner objekt
		 * skriv ut fråga
		 * läsa in svar
		 * plocka ut täljare
		 * plocka ut nämnare
		 *
		 *
		 *
		 *
		 */



		Scanner sc = new Scanner(System.in);


		System.out.println("mata in täljare och nämnare :");

		String s =sc.nextLine();

		String t=s.substring(0,s.lastIndexOf(' '));
		String n=s.substring(s.lastIndexOf(' ')+1);

		int täljare= Integer.parseInt( t );

		int nämnare=Integer.parseInt(n);

		System.out.println(täljare);
		System.out.println(nämnare);

		int hela =  täljare/nämnare;

		int rest =  täljare%nämnare;


		System.out.println(hela+" "+rest+"/"+nämnare );
		System.out.println(rest);

	}


}
