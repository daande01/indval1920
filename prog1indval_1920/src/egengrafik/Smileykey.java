package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Smileykey extends JComponent implements KeyListener {

	int x = 100;
	int y = 100;
	int xv = 2;
	int yv = 3;

	static Timer t;

	public Smileykey() {

		this.addKeyListener(this);

		this.setPreferredSize(new Dimension(400, 400));

		t = new Timer(60, e -> {

			update();

		});

		t.start();

	}

	public void update() {

		// yv=yv+1;

		// x += xv; /// -20 -19 -18 -1 0 1
		// y = y + yv;
		repaint();

		if (y >= 400 - 100) {
			y = 300;

			yv = yv * -1;

		}
		if (x >= 400 - 100) {
			x = 300;

			xv = xv * -1;

		}
		if (y <= 0) {

			y = 0;

			yv = yv * -1;
		}
		if (x <= 0) {
			x = 0;

			xv = xv * -1;

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

		f.setContentPane(new Smileykey());
		f.pack();
		// f.setFocusable(true);
		f.setFocusTraversalKeysEnabled(true);

	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_UP) {

			y = y - 10;

		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {

			y = y + 10;

		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

			x = x + 10;

		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {

			x = x - 10;

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public boolean isFocusTraversable() {
		return true;
	}

}
