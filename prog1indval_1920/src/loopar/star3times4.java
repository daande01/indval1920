package loopar;

public class star3times4 {

	public static void main(String[] args) {

		for (int k = 0; k < 5; k++) {

			for (int i = 0; i < 10; i++) {

				for (int j = 0; j < i; j++) {

					System.out.print("+");
				}
				System.out.println("");

			}

		}
	}
}
