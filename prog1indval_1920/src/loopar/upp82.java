package loopar;

import java.util.Arrays;

public class upp82 {

	public static void main(String[] args) {

		int[] i = new int[5];

		for (int j = 0; j < i.length; j++) {

			i[j] = j + 1;

		}

		for (int j = 4; j >= 0; j--) {

			System.out.println(i[j]);
		}

		System.out.println(Arrays.toString(i));


}
