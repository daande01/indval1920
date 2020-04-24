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

public class jcompandswing extends JComponent {

	private int x=100;
	private int y =100;


	public jcompandswing() {
		// TODO Auto-generated constructor stub

		setPreferredSize(new Dimension(300,300));
	}

	private void changexpos(int xpos) {

		x=xpos;
		repaint();

	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);

		g.setColor(Color.pink);
		g.fillOval(x, y, 30, 30);


	}




	public static void main(String[] args) {


		jcompandswing com= new jcompandswing();
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		JTextField text= new JTextField(20);
		JButton b1 = new JButton("move");

		b1.addActionListener(e->{

			String input = text.getText();

			int xpos= Integer.parseInt(input);

			com.changexpos(xpos);


		});

		p.add(text);
		p.add(b1);
		p.add(com);

		Container c = f.getContentPane();

		c.add(p);
		f.pack();

		f.setVisible(true);




	}









}
