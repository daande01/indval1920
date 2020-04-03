package egengrafik.tvåbollar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Spelplan extends JComponent {

	Boll b1;
	Boll b2;

	public Spelplan() {
		this.setPreferredSize(new Dimension(400, 400));
		b1 = new Boll(Math.random() * 400, Math.random() * 400, Math.random() * 3 + 0.5, Math.random() * 3 + 0.5,
				new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)),
				(int) (Math.random() * 50));

		b2 = new Boll(Math.random() * 400, Math.random() * 400, Math.random() * 3 + 0.5, Math.random() * 3 + 0.5,
				new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)),
				(int) (Math.random() * 50));

		Timer t = new Timer(40, e -> {

			b1.update();
			b2.update();

			repaint();

		});

		t.start();

	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		b1.rita(g);
		b2.rita(g);

	}

	public static void main(String[] args) {

		JFrame jf = new JFrame();
		jf.setContentPane(new Spelplan());
		jf.pack();
		jf.setVisible(true);

	}

}
