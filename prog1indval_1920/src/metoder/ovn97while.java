package metoder;

public class ovn97while {

	static String v�ndText(String text) {

		int i = text.length() - 1;
		String reverse = "";

		while ( i >= 0) {

			reverse = reverse + "" + text.charAt(i);
			i--;
		}

		return reverse;

	}

	public static void main(String[] args) {


		String svar=ovn97while.v�ndText("sirap");

		System.out.println(svar);

	}

}
