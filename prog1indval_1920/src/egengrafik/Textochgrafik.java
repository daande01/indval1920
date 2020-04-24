package egengrafik;



import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Textochgrafik extends JComponent  {

	int x=200;

	boolean redbool = true;
	static Timer t ;
	public Textochgrafik() {

		setPreferredSize(new Dimension(240, 240));

		 t = new Timer(1000, e -> {

			this.repaint();

		});
		t.start();

	}

	private void changeXpos(int input) {

		x=input;

	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		if (redbool == true) {
			g.setColor(Color.red);
			g.fillOval(x, 200, 20, 20);
			redbool = false;
		} else {

			redbool = true;
		}

	}

	public static void main(String[] args) {

		Textochgrafik t2 = new Textochgrafik();
		JFrame f = new JFrame("ljus");
		JTextField text= new JTextField(20);
		JButton b = new JButton("stop");

		b.addActionListener(e->{


			int input =Integer.parseInt(text.getText());

			t2.changeXpos(input);

		});

		JPanel p = new JPanel();

		p.add(b);
		p.add(text);
		p.add(t2);

		Container c = f.getContentPane();
		c.add(p);
		f.pack();

		f.setSize(400, 400);
		f.setVisible(true);
	}







}
