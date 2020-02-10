package metoder;

import java.util.Scanner;

public class ovn91 {

	static final double PI = 3.14;


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ange radie");
		 int r = sc.nextInt();

		double svar=basytaAreaCylinder(r);
		System.out.println(svar);

	}

	public static double basytaAreaCylinder(int k) {

		double d =k*k*PI;

		return d;



	}

	static double volymCylinder(double radie , double höjd) {

		double d = basytaAreaCylinder((int)radie)* höjd ;

		return d;

	}


}
