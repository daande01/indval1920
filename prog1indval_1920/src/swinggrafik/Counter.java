package swinggrafik;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter extends JFrame {
	private int i = 0;
	private JButton b1=new JButton("+");
	private JButton b2=new JButton("-");
	private JLabel  l1= new JLabel(""+i);


	public Counter() {


		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		add(l1);
		add(b1);
		add(b2);
		b1.addActionListener(e->{

			i++;
			l1.setText(""+i);
		});
		b2.addActionListener(e->{
			i--;
			l1.setText(""+i);

		});


	}



	public static void main(String[] args) {

		new Counter();



	}







}
