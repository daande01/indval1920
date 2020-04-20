package egengrafik.massabollar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.LinkedList;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Spelplan extends JComponent {

	 LinkedList<Boll> bollar = new LinkedList<Boll>();



	public Spelplan() {
		this.setPreferredSize(new Dimension(400, 400));

			for (int i = 0; i < 10; i++) {



		bollar.add( new Boll(Math.random() * 400, Math.random() * 400, Math.random() * 3 + 0.5, Math.random() * 3 + 0.5,
				new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)),
				(int) (Math.random() * 50)));

			}

		Timer t = new Timer(40, e -> {


			for (Boll boll : bollar) {

				boll.update();

			}


			repaint();

		});

		t.start();

	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		for (Boll boll : bollar) {
			boll.rita(g);
		}


	}

	public static void main(String[] args) {

		JFrame jf = new JFrame();
		jf.setContentPane(new Spelplan());
		jf.pack();
		jf.setVisible(true);

	}

}
