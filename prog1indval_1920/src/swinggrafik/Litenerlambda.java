package swinggrafik;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Litenerlambda extends JFrame {

	private JButton b1=new JButton("send");
	private JButton b2=new JButton("send");
	private JLabel  l1= new JLabel("");

	public Litenerlambda() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		add(l1);
		add(b1);
		add(b2);
		b1.addActionListener(e->{
			System.out.println("knapp1");
			l1.setText("test");
		});
		b2.addActionListener(e->{

			l1.setText("");

		});


	}



	public static void main(String[] args) {

		new Litenerlambda();



	}







}
