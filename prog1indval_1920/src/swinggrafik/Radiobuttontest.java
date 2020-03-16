package swinggrafik;

import java.awt.Checkbox;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Radiobuttontest extends JFrame {

	JRadioButton b1 = new JRadioButton("katt");
	JRadioButton b2 = new JRadioButton("hund");
	JRadioButton b3 = new JRadioButton("elefant");
	ButtonGroup g1 = new ButtonGroup();
 	JButton    send= new JButton("send");
 	Checkbox  c1 = new Checkbox("vill du ha reklam mail");


	public Radiobuttontest() {

		g1.add(b1);
		g1.add(b2);
		g1.add(b3);

		setLayout(new FlowLayout());
		setSize(500, 500);
		setVisible(true);
		add(b1);
		add(b2);
		add(b3);
		add(send);
		add(c1);
		send.addActionListener(e->{

			if (b1.isSelected()) {

				System.out.println("du har valt b1");
			}

			if (c1.getState()) {
				System.out.println("du vill ha reklam");
			}

		});




	}

	public static void main(String[] args) {

		new Radiobuttontest();
	}

}
