package metoder;

import java.util.Arrays;

public class metoder3 {

	// Skapa en metod som du kan använda för att kryptera en text genom byta ut alla tecken mot deras värde i teckentabellen unicode.

	public static void main(String[] args) {



		System.out.println(Arrays.toString(krypteraStringToIntsarr("AA AA")));




		System.out.println(krypteraIntArrToString(krypteraStringToIntsarr("AA AA")));

	}



	public static int [] krypteraStringToIntsarr(String text){
		int i [] = new int [text.length()];

		for (int j = 0; j < i.length; j++) {

			i[j] =text.charAt(j);

		}

		return i;

	}

	public static String krypteraIntArrToString(int[] i){

		String text="";

		for (int j = 0; j < i.length; j++) {

			text +=(char)i[j];

		}

		return text;

	}






}
