package loopar;

public class Rik {


	public static void main(String[] args) {

		int dagar=0;
		int totall�n=0;
		int l�n=1;


		while(totall�n <= 1000000) {

			l�n=l�n*2;

			totall�n=totall�n +(l�n);

			dagar++;

		}

		System.out.println(dagar);

	}



}
