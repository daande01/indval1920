package metoder;

import java.util.Arrays;
import java.util.Scanner;

public class ovn96 {

	static int antal;


	public static void main(String[] args) {
		double [] tid = new double[100];
		intTid(tid);
		utTid(tid);

	}


	private static void utTid(double[] tid) {

		Scanner scan= new Scanner(System.in);
		System.out.println("skriv tid");
		antal=0;
		double temp = scan.nextDouble();
		while(temp!=0) {

			tid[antal]=temp;
			antal++;
			temp=scan.nextDouble();

		}

	}


	private static void intTid(double[] tid) {

		System.out.println(Arrays.toString(tid));
	}



}
