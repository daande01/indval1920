package egengrafik;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Smiley extends JComponent {


	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.setColor(Color.yellow);
		g.fillOval(100, 100, 100, 100);
		g.setColor(Color.BLACK);
		g.fillOval(100, 100, 10, 10);

	}

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setVisible(true);
		f.setSize(400,400);
		f.setContentPane(new Smiley());



	}

}
