package swinggrafik;

import java.awt.FlowLayout;
import java.awt.Font;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class alarm extends JFrame {

	JLabel l1 = new JLabel(LocalTime.now().toString().substring(0, 8));
	JTextField tf = new JTextField(20);
	String alarmtid = "";

	public alarm() {

		tf.setText("00:00:00");
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				l1.setText(LocalTime.now().toString().substring(0, 8));

				if (alarmtid.equals(LocalTime.now().toString().substring(0, 8))) {

					for (int i = 0; i < 10; i++) {


					java.awt.Toolkit.getDefaultToolkit().beep();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				}

			}
		};
		Timer timer = new Timer("Timer");

		long delay = 1000L;
		long period = 1000L;
		timer.scheduleAtFixedRate(task, delay, period);

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500, 500);
		l1.setFont(new Font("arial", 2, 50));
		add(l1);
		add(tf);
		tf.addActionListener(e -> {

			alarmtid = tf.getText();

		});

	}

	public static void main(String[] args) {

		new alarm();
	}

}
