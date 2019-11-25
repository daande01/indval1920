package prog1indval_1920;

public class Tid {


	public static void main(String[] args) {


		int tottid = 3666;   // är i sekunder

		int timmar=tottid /(3600);   // timmar 1st

		int resttimmar=tottid % (60*60); // rest 66st

		int minuter=resttimmar / 60 ;   //   antal minuter 1

		int minuterrest = resttimmar % 60; // antal sekunder 6st

		int sekunder = minuterrest;

		char c=012; // test av enter slag för att test \n och se likheter. 12 är new line tecken.

		System.out.println(c+"antal timmar:"+timmar+"\nantal minuter:"+minuter+"\nantal sekunder:"+sekunder);




	}





}
