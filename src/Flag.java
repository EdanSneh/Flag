import java.awt.*;
import javax.swing.JFrame;
import java.math.*;

public class Flag extends JFrame {
	
	
	
	public Flag () {
		init();
	}
	//int width = getWidth();
	//int height = getHeight();
	public void init() {
		
		
		setSize(1000, 1000);
		setBackground(Color.WHITE);
		repaint();
		
		
	}
	float colonies = (float) (1.00/13.00);
	public void paint(Graphics g) {
		//stripes
		for(int i = 0; i<13; i+=2){
		g.setColor(Color.red);
		g.fillRect(50, (int)(50+.769*40*i), 19*40, (int)(.769*40));
			
			if(i % 2 == 0 && i != 12){
			g.setColor(Color.white);
			g.fillRect(50, (int)(50+.769*40*(i+1)), 19*40, (int)(.769*40));
			}
		}
		//bluesquare
		g.setColor(Color.blue);
		g.fillRect(50, 50,(int)(7.6*40),(int)(5.385*40));
		
		//outline
		g.setColor(Color.black);
		g.drawRect(50, 50, 19*40, 10*40);
		
		
		
		//stars
		double sradius= 0.381966*.616*40;
		double lradius = 1 *.616*40;
		
		int[] xstar = new int[10];		
		int[] ystar = new int[10];
		int i = 0;
		for(double j = 0; j<360; j+=36){
			
			if(i % 2 == 0){
				xstar[i] = (int)(Math.cos(Math.toRadians(j-18))*lradius) + 200;
				ystar[i] = (int)(Math.sin(Math.toRadians(j-18))*lradius) + 200;	
			}
			else{
				xstar[i] = (int)(Math.cos(Math.toRadians(j-18))*sradius) + 200;
				ystar[i] = (int)(Math.sin(Math.toRadians(j-18))*sradius) + 200;
			
			}
			i++;		
		}
		g.drawPolygon(xstar,ystar, 10);
		
		
		}

}