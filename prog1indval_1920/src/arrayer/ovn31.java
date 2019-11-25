package arrayer;

import java.util.Arrays;
import java.util.Scanner;

public class ovn31 {


	public static void main(String[] args) {

		int [] i =new int[4];
		Scanner sc = new Scanner(System.in);

		System.out.println("ange fyra tal med enter slag mellan");
		i[0]=sc.nextInt();
		i[1]=sc.nextInt();
		i[2]=sc.nextInt();
		i[3]=sc.nextInt();

		System.out.println(Arrays.toString(i));



	}
}
