package loopar;

public class Wordmirror {

	public static void main(String[] args) {


		String ord= "daniel";

		int längd =ord.length();

		System.out.println(längd);


		for (int i =längd-1 ; i>=0 ; i--) {

			System.out.print(ord.charAt(i));

		}


	}




}
