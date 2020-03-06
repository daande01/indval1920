package swinggrafik;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Jbuttontest extends JFrame implements ActionListener {

	private JButton b1=new JButton("send");
	private JButton b2=new JButton("send");

	public Jbuttontest() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);


	}





	public static void main(String[] args) {

		new Jbuttontest();



	}





	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource()==b1) {
			System.out.println("du har klickat på knapp b1");

		}else {
			System.out.println("du har klickat på knapp b2");

		}




	}

}
