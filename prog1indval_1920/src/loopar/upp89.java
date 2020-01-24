package loopar;

public class upp89 {

	public static void main(String[] args) {

		double saldo=0;
		int år=0;

		for (; saldo<=100000; år++) {

			saldo = saldo* 1.05;

			saldo=saldo+1000;

		}


		System.out.print(saldo+" antal år"+ år);

	}



}
