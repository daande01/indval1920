package egengrafik.tvåbollar;

import java.awt.Color;
import java.awt.Graphics;

public class Boll {

	private double x;
	private double y;
	private double xv;
	private double yv;
	private Color färg ;
	private int radie;

	public Boll(double xx, double yy, double xvv, double yvv, Color f , int r) {

		this.x=xx;
		this.y=yy;
		this.xv=xvv;
		this.yv=yvv;
		this.färg=f;
		this.radie=r;
	}


	public void rita(Graphics g){

		g.setColor(färg);
		g.fillOval(xToInt(), yToInt(), radie*2, radie*2);


	}

	public void update(){

		yv= yv+1; // gravitation

		if(y>400-radie*2) {

			y=400-radie*2;
			yv=-yv;

		}

		x+=xv;
		y+=yv;




	}

	public int xToInt() {

		return (int) Math.round(x);

	}
	public int yToInt() {

		return (int) Math.round(y);
	}


}
