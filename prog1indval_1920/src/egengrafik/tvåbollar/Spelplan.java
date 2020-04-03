package egengrafik.tvåbollar;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Spelplan extends JComponent {

	Boll b1;
	Boll b2;


	public Spelplan() {

		b1 = new Boll(Math.random()*400, Math.random()*400, Math.random()*3+0.5, Math.random()*3+0.5, new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)),(int)( Math.random()*50));



	}



	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
	}




	public static void main(String[] args) {

	}


}
