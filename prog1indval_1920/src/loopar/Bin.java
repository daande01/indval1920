package loopar;

public class Bin {

	public static void main(String[] args) {


	int k = 0;

	for (int j = 0; j < 256; j++) {


		if (intToBinary(j).charAt(0) == '1' && intToBinary(j).charAt(2) == '1') {
			k++;

		}
		if (intToBinary(j).charAt(6) == '1' && intToBinary(j).charAt(7) == '1') {
			k++;

		}

	}
	System.out.print(k);
}

public static String intToBinary(int n) {
	String s = "";
	while (n > 0) {
		s = ((n % 2) == 0 ? "0" : "1") + s;
		n = n / 2;
	}
	while (s.length() < 8) {

		s = s + "0";
	}

	return s;
}

}
