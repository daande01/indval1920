package loopar;

public class upp88 {

	public static void main(String[] args) {

		double saldo=0;


		for (int år = 0; år < 21; år++) {

			saldo = saldo* 1.05;

			saldo=saldo+1000;

		}


		System.out.print(saldo);

	}



}
