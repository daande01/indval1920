package prog1indval_1920;

import java.util.Scanner;

public class Ovn77 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int behållning=1000;
		int val=0;


		do {
		System.out.println("MENY \n 1.instättning \n 2.uttag \n 3.visa behållning");

		 val = sc.nextInt();

		switch (val) {

		case 1:
				System.out.println("hur mycket skall du sätta in ");
				behållning =behållning + sc.nextInt();
				System.out.println(behållning);
				break;
		case 2:
				System.out.println("hur mycket skall du ta ut ");
				behållning =behållning - sc.nextInt();
				System.out.println(behållning);
				break;
		case 3:

				System.out.println(behållning);
				break;

		case 0: System.exit(0);

				break;

		}


		}while( val!=0 );

System.out.println("hit");

	}


}
