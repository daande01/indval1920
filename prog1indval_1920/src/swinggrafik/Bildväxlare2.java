package swinggrafik;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Bildväxlare2 extends JFrame {


JButton b1 = new JButton("knapp");

	JLabel l1 = new JLabel(new ImageIcon("bild.png"));

	public Bildväxlare2() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(200,200);
		add(l1);
		add(b1);
		b1.addActionListener(e->{

			if(l1.getIcon().toString().equals("bild.png")) {

					l1.setIcon(new ImageIcon("bild2.png"));
			}else {


				l1.setIcon(new ImageIcon("bild.png"));
			}



		});


	}


	public static void main(String[] args) {

		new Bildväxlare2();

	}


}
