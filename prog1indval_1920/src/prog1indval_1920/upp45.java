package prog1indval_1920;

import java.util.Scanner;

public class upp45 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		System.out.println("mata in t�ljare och n�mnare :");

		String s =sc.next();

		System.out.println(s.lastIndexOf(' '));
		int t�ljare= Integer.parseInt(  s.substring(0,s.lastIndexOf(' '))   );

		System.out.println(t�ljare);
	}


}
