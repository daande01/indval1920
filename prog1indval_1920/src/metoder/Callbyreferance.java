package metoder;

import java.util.Arrays;

public class Callbyreferance {
	public static void main(String[] args) {

		int[] i = { 0, 1, 2, 3, 4 };

		changearray(i);

		System.out.println(Arrays.toString(i));

	}

	private static void changearray(int[] j) { // call by reference

		j[4]=0;

	}
}