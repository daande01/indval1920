package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class bana extends JComponent {



	int a[]= {0,90,180};

	int x=100;
	int y=100;

	public bana() {
		// TODO Auto-generated constructor stub




	}


	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);

	g.setColor(Color.pink);


	g.fillRect(100, 100, 40, 10);


	for (int i = 0; i < a.length; i++) {



	if(a[i]==0) {

		g.fillRect(x, y, 40, 10);

		x=x+40;
		y=y;

	}else if(a[i]==90) {


		y=y-40;
		x=x-10;
		g.fillRect(x, y, 10, 40);

		x=x+40;
		y=y;




	}else if(a[i]==180) {



	}else {



	}

	}


	}




	public static void main(String[] args) {


		JFrame f = new JFrame();
		f.setContentPane(new bana());

		f.setVisible(true);
		f.setSize(new Dimension(400,400));

	}










}
