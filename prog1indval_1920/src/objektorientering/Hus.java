package objektorientering;

public class Hus {

private int antalv�ningar;
private int area;


public Hus() {

	area= 10;
	antalv�ningar=10;
	System.out.println(area +" "+ antalv�ningar);


}


public Hus(int a, int v) {



	area= a;
	antalv�ningar=v;
	System.out.println(area +" "+ antalv�ningar);


}

public void byggTill(int extraarea) {


	area=area+extraarea;

}

public int getArea() {

	return area;
}



public static void main(String[] args) {

	Hus h1=new Hus(10,3);

	h1.area=1000;

	h1.byggTill(50);
	int area=h1.getArea();
System.out.println(area);

	new Hus(20,4);


}



}
