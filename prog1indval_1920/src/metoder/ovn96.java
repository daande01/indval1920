package metoder;

import java.util.Arrays;
import java.util.Scanner;

public class ovn96 {

	static int antal;


	public static void main(String[] args) {
		double [] tid = new double[100];
		inTid(tid);
		utTid(tid);
		System.out.println(  snabbTid(tid)  );
	}


	private static void inTid(double[] tid) {

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


	private static void utTid(double[] tid) {

		System.out.println(Arrays.toString(tid));
	}

	static double snabbTid(double [] tid) {

		double snabbast=999999999999.0;

		for (int i = 0; i < tid.length; i++) {

			if( tid[i]< snabbast && tid[i]!=0) {

				snabbast=tid[i];
			}
		}



		return  snabbast  ;
	}




}
