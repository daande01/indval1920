package prog1indval_1920;

import java.util.Scanner;

public class upp45 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		System.out.println("mata in täljare och nämnare :");

		String s =sc.next();

		System.out.println(s.lastIndexOf(' '));
		int täljare= Integer.parseInt(  s.substring(0,s.lastIndexOf(' '))   );

		System.out.println(täljare);
	}


}
