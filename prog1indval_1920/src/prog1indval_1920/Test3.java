package prog1indval_1920;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		double k = 10;
		double u = 3;

		int svar = k / u;

		int rest1 = 10 - (svar * 3);

		double rest = k % u;

		String[] s = new String[5];

		s[0] = "dsfdgdf dgdfgdfg bdfgdfg";

		int[] i = new int[5];

		i[0] = 10;

		i[4] = 34;

		System.out.println(Arrays.toString(i));

		double[] r = { 1, 4, 5, 68, 9.0, 0, 9 };

		int summa = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("ane fem siffror");

		summa = summa + sc.nextInt();

		summa = summa + sc.nextInt();

		summa = summa + sc.nextInt();

		summa = summa + sc.nextInt();

		summa = summa + sc.nextInt();

		double medel = summa / 5.0;

		System.out.println(medel);

	}
}
