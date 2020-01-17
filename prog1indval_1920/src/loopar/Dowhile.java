package loopar;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int val ;


		do {

			System.out.println("välj 1=google 2 = multiplikation");
			val=sc.nextInt();


			switch(val) {

			case 1:
				String url = "http://www.google.com";

		        if(Desktop.isDesktopSupported()){
		            Desktop desktop = Desktop.getDesktop();
		            try {
		                desktop.browse(new URI(url));
		            } catch (IOException | URISyntaxException e) {
		                // TODO Auto-generated catch block
		                e.printStackTrace();
		            }
		        }else{
		            Runtime runtime = Runtime.getRuntime();
		            try {
		                runtime.exec("xdg-open " + url);
		            } catch (IOException e) {
		                // TODO Auto-generated catch block
		                e.printStackTrace();
		            }
		        }
				break;

			case 2:
				  try {
					     if (Desktop.isDesktopSupported()) {
					       Desktop.getDesktop().open(new File("c:\\a.doc"));
					     }
					   } catch (IOException ioe) {
					     ioe.printStackTrace();
					  }
				break;

			case 5:
				System.out.println("shutting down");
				break;
			default:
				System.out.println("den innehåller något annat");

			}


		}while(val!=5);






	}

}
