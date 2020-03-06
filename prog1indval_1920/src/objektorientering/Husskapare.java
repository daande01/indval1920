package objektorientering;

public class Husskapare {

	public static void main(String[] args) {

		Hus h2=new Hus(200,2 );

		h2.byggTill(10000);
		System.out.println( h2.getArea()  );


		new Hus();

	}


}
