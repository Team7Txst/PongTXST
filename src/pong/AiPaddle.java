package pong;

import javafx.scene.paint.Color;
import java.awt.Graphics;

public class AiPaddle implements Paddle{
	boolean upAccel, downAccel;
	double y, yVel;
	int Ai, x
	Ball b1;
	final double GRAV = 0.94;
	
	public AiPaddle(int Ai, Ball b) {
		upAccel = false;
		downAccel = false;
		y = 210;  
		yVel = 0;
		b1 = b;
		
		if(Ai == 1) 
			x = 20;
		else
			x = 660;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.AQUA);
		g.fillRect(x, (int)y, 20, 80);
	}
	
	public void move() {
		y = b1.getY() - 40;
		if(y < 0)
			y = 0;
		if(y > 420)
			y = 420;
	}
	
	public void getY() {
		return (int)y;
	}
	
}
