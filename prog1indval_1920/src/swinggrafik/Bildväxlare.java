package swinggrafik;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Bildv�xlare extends JFrame {

boolean bild=true;
JButton b1 = new JButton("knapp");

	JLabel l1 = new JLabel(new ImageIcon("bild.png"));

	public Bildv�xlare() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(200,200);
		add(l1);
		add(b1);
		b1.addActionListener(e->{

			if(bild==true) {

				l1.setIcon(new ImageIcon("bild2.png"));
				bild=false;
			}else if(bild==false) {

				l1.setIcon(new ImageIcon("bild.png"));
				bild=true;

			}


		});


	}





	public static void main(String[] args) {

		new Bildv�xlare();

	}


}
