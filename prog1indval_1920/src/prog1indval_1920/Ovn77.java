package prog1indval_1920;

import java.util.Scanner;

public class Ovn77 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int beh�llning=1000;
		int val=0;


		do {
		System.out.println("MENY \n 1.inst�ttning \n 2.uttag \n 3.visa beh�llning");

		 val = sc.nextInt();

		switch (val) {

		case 1:
				System.out.println("hur mycket skall du s�tta in ");
				beh�llning =beh�llning + sc.nextInt();
				System.out.println(beh�llning);
				break;
		case 2:
				System.out.println("hur mycket skall du ta ut ");
				beh�llning =beh�llning - sc.nextInt();
				System.out.println(beh�llning);
				break;
		case 3:

				System.out.println(beh�llning);
				break;

		case 0: System.exit(0);

				break;

		}


		}while( val!=0 );

System.out.println("hit");

	}


}
