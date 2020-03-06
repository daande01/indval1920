package swinggrafik;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Innerlistener extends JFrame implements ActionListener {

	private JButton b1=new JButton("send");
	private JButton b2=new JButton("send");

	public Innerlistener() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		add(b1);
		add(b2);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("knapp1");

			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("knapp2");
			}
		});


	}



	public static void main(String[] args) {

		new Innerlistener();



	}







}
