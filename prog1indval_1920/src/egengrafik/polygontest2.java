package egengrafik;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class polygontest2 extends JComponent {

	int x[]= {100, 150 ,200};
	int y[]= {100, 50 ,150};



	public polygontest2() {

		setPreferredSize(new Dimension(400,400));

	}


	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);


		g.setColor(Color.black);

		g.fillPolygon(x, y, 3);


	}

	public void changeX(int xx) {

		x[1]=xx;
		repaint();


	}



	public static void main(String[] args) {


		polygontest2 p = new polygontest2();
		JTextField ff= new JTextField(20);
		JButton b1 = new JButton("changexpostion för hörn 1");
		JPanel p1 = new JPanel();
		JFrame f = new JFrame();
		Container c = f.getContentPane();
		c.add(p1);
		p1.setLayout(new FlowLayout());
		p1.add(p);
		p1.add(ff);
		p1.add(b1);

		f.setVisible(true);
		f.setSize(400, 400);
		f.pack();

		// jag glömde viss att lägga till f.pack(); som ser till att komponenterna får plats
		b1.addActionListener(e->{


			p.changeX(Integer.parseInt(ff.getText()));

		});





	}







}
