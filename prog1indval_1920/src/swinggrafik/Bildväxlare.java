package swinggrafik;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Bildväxlare extends JFrame {




	JLabel l1 = new JLabel(new ImageIcon("bild.png"));

	public Bildväxlare() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(200,200);
		add(l1);




		l1.setIcon(new ImageIcon("annanbild.png"));

	}





	public static void main(String[] args) {

		new Bildväxlare();

	}


}
