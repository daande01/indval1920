package metoder;

public class metoder5 {

	public static void main(String[] args) {

		//printRandomInt();
		//printOneHundredRandoInt();
		printRandomInt(4);
	}

	public static void printRandomInt() {

		int i  = (int) (Math.random()  *100 +1);

		System.out.println(i);

	}

	public static void printOneHundredRandoInt() {

		for(int k= 0; k<100;k++) {
		int i  = (int) (Math.random()  *100 +1);

		System.out.println(i);
		}
	}

	public static void printRandomInt(int i) {

		for(int k =0; k<i;k++) {

			int f  = (int) (Math.random()  *100 +1);

			System.out.println(f);


		}




	}


}