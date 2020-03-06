package swinggrafik;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Litenerlambda extends JFrame {

	private JButton b1=new JButton("send");
	private JButton b2=new JButton("send");

	public Litenerlambda() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		add(b1);
		add(b2);
		b1.addActionListener(e->{
			System.out.println("knapp1");

		});
		b2.addActionListener(e->{

			System.out.println("kanpp2");

		});


	}



	public static void main(String[] args) {

		new Litenerlambda();



	}







}
