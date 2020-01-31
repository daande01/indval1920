package metoder;

public class Mattematik {

	public static void summera(int i, int k) {

		int svar = i + k;
		System.out.println(svar);

	}
	public static int subtrahera(int i, int k) {

		int svar = i - k;

		return svar;

	}
	public static void main(String[] args) {
		summera(2, 4);
		int s=subtrahera(4, 2);
		System.out.println(s);
	}

}
