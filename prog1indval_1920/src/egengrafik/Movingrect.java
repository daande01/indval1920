package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Movingrect extends JComponent{

	private int x=100;
	private int y =100;

	static Timer t;

	public Movingrect() throws InterruptedException {

			this.setPreferredSize(new Dimension(400,400));

			 t = new Timer(40, e->{

				update();

			});

			t.start();

	}



	private void update() {
		repaint();
		x=x+5;



	}



	@Override
	protected void paintComponent(Graphics arg0) {

		super.paintComponent(arg0);

		arg0.setColor(Color.black);
		arg0.fillRect(x, y, 50, 50);
	}






	public static void main(String[] args) throws InterruptedException {

		JFrame f= new JFrame();
		JButton b1 = new JButton("stop");
		JPanel p1 = new JPanel();

		p1.add(new Movingrect());
		p1.add(b1);

		b1.addActionListener(e->{

			t.stop();

		});


		f.setContentPane(p1);
		f.setVisible(true);
		f.setSize(400,400);
		f.pack();


	}




}
