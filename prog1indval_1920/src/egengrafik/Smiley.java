package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Smiley extends JComponent {

	int x = 100;
	int y = 100;
	int xv=2;
	int yv=2;

	static Timer t;

	public Smiley() {

		this.setPreferredSize(new Dimension(400,400));

		t = new Timer(40, e -> {

			update();

		});

		t.start();

	}

	public void update() {

		//yv=yv+1;



		x += xv;                      /// -20 -19 -18 -1 0 1
		y = y + yv;
		repaint();

		if(y>=400-100) {
			y=300;

			yv=yv*-1;

		}




	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.setColor(Color.yellow);
		g.fillOval(x, y, 100, 100);
		g.setColor(Color.BLACK);
		g.fillOval(x + 30, y + 30, 10, 10);
		g.fillOval(x + 60, y + 30, 10, 10);
		g.drawLine(x + 30, y + 70, x + 70, y + 70);

	}

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setVisible(true);

		f.setContentPane(new Smiley());
		f.pack();

	}

}
