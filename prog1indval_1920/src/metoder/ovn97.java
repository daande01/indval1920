package metoder;

public class ovn97 {

	static String vändText(String text) {

		int i = text.length() - 1;
		String reverse = "";

		for (; i >= 0; i--) {

			reverse = reverse + "" + text.charAt(i);

		}

		return reverse;

	}

	public static void main(String[] args) {


		String svar=ovn97.vändText("sirap");

		System.out.println(svar);

	}

}
