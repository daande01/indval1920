package prog1indval_1920;

import java.util.Scanner;

public class Öv22lösning2 {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);

		System.out.print("skriv ett tal som du vill upphöja till 2");


		String tal=sc.nextLine();

		double tal1=Double.parseDouble(tal);

		double svar = Math.pow(tal1, 2);

		System.out.println((int)(svar+0.5));


	}


}
