package metoder;

import java.util.Scanner;

public class ovn91 {




	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ange radie");
		 int r = sc.nextInt();

		double svar=basytaAreaCylinder(r);
		System.out.println(svar);

	}

	public static double basytaAreaCylinder(int k) {

		return k*k*Math.PI;



	}

}
