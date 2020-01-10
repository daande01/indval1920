package loopar;

public class Rik {


	public static void main(String[] args) {

		int dagar=0;
		int totallön=0;
		int lön=1;


		while(totallön <= 1000000) {

			lön=lön*2;

			totallön=totallön +(lön);

			dagar++;

		}

		System.out.println(dagar);

	}



}
