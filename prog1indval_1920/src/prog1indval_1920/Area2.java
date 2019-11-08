package prog1indval_1920;

import java.util.Scanner;

public class Area2 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		System.out.println("ange höjd");
		int h=scan.nextInt();
		System.out.println("ange bas");
		int b=scan.nextInt();

		int tarea=b*h/2;

		int rarea=b*h;

		System.out.println("t area"+tarea+" r area "+rarea);
	}
}
