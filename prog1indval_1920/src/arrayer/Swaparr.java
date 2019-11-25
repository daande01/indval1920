package arrayer;

import java.util.Arrays;

public class Swaparr {
	public static void main(String[] args) {

	int [] k = {0,1,2};


	int temp= k[2]; // temp= 2 , k[2]=2
	k[2]=k[0];
	k[0]=temp;



	System.out.println(Arrays.toString(k));



	}
}
