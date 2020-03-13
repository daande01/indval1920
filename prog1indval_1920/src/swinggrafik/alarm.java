package swinggrafik;

import java.awt.FlowLayout;
import java.awt.Font;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class alarm extends JFrame {

JLabel l1 = new JLabel(LocalTime.now().toString().substring(0,8));

	public alarm() {

		TimerTask task = new TimerTask() {
		        @Override
				public void run() {
		          l1.setText(LocalTime.now().toString().substring(0,8));
		          java.awt.Toolkit.getDefaultToolkit().beep();
		        }
		    };
		    Timer timer = new Timer("Timer");


		    long delay = 1000L;
		    long period = 1000L ;
		    timer.scheduleAtFixedRate(task, delay, period);



		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500,500);
		l1.setFont(new Font("arial", 2, 50));
		add(l1);




	}


	public static void main(String[] args) {


		new alarm();
	}

}
