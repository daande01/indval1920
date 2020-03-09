package swinggrafik;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestJTextField extends JFrame {


	JTextField t1 = new JTextField(30);
	JTextArea  a1 = new JTextArea(10,20);
	JButton    b1= new JButton("knapp");
	JLabel l1 = new JLabel("");


	public TestJTextField() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		add(t1);
		add(a1);
		add(b1);
		add(l1);
		b1.addActionListener(e->{

		String text1=t1.getText();
		String text2 = a1.getText();
			l1.setText(text1+"  "+ text2);

		});

	}



	public static void main(String[] args) {

		new TestJTextField();

	}



}
