package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class linetest extends JComponent{


	public linetest() {

		int k= (int)(Math.sin(Math.toRadians(45))*100);

		System.out.print(k);

		// TODO Auto-generated constructor stub
	}



	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);

		g.setColor(Color.BLACK);
		g.drawLine(100, 100, (int)(Math.cos(Math.toRadians(45))*50)+100,(int)(Math.sin(Math.toRadians(45))*50)+100 );

		// här har ni början till en visare testa och ändra grad värdena för både cos och sin till 90 sedan 180 också
		// vidare så ser ni hur den beter sig . lycka till.

	}


	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setContentPane(new linetest());

		f.setVisible(true);
		f.setSize(new Dimension(400,400));




	}






}
