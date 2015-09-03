import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class FlagC extends JComponent{

	public void paint(Graphics g) {
		float colonies = (float) (1.00/13.00);
		double ratio = 40;
		//find ratio
		if(getWidth()*10<getHeight()*19){
		ratio = getWidth()/19;
		}
		else{
		ratio = getHeight()/10;
		}
		// = getHeight();
		//stripes
		for(int i = 0; i<13; i+=2){
		g.setColor(Color.red);
		g.fillRect(0, (int)(.769*ratio*i), (int)(19*ratio), (int)(.769*ratio));
		
			if(i % 2 == 0 && i != 12){
			g.setColor(Color.white);
			g.fillRect(0, (int)(.769*ratio*(i+1)), (int)(19*ratio), (int)(.769*ratio));
			}
		}
		//bluesquare
		g.setColor(Color.blue);
		g.fillRect(0, 0,(int)(7.6*ratio),(int)(5.385*ratio));
		
		//outline
		g.setColor(Color.black);
		g.drawRect(0, 0, (int)(19*ratio), (int)(10*ratio));
		
		
		
		//stars
		double sradius= 0.381966*.5*.616*ratio;
		double lradius = 1*.5*.616*ratio;
		
		int[] xstar = new int[10];		
		int[] ystar = new int[10];
		int i;
		
		//sixrow stars
		
		for(int q = 0; q<5; q++){
			
			for(int r = 0; r<6; r++){
				i = 0;				
				
				
				for(double j = 0; j<360; j+=36){
					
					if(i % 2 == 0){
						xstar[i] = (int)((Math.cos(Math.toRadians(j-18))*lradius) +(.63*ratio)+(.63*ratio*2*r));
						ystar[i] = (int)((Math.sin(Math.toRadians(j-18))*lradius) +(.54*ratio)+(.54*ratio*2*q));	
					}
					else{
						xstar[i] = (int)((Math.cos(Math.toRadians(j-18))*sradius) +(.63*ratio)+(.63*ratio*2*r));
						ystar[i] = (int)((Math.sin(Math.toRadians(j-18))*sradius) +(.54*ratio)+(.54*ratio*2*q));
					
					}
					i++;		
				}
				g.setColor(Color.WHITE);
				g.fillPolygon(xstar,ystar, 10);
				g.setColor(Color.BLACK);
				g.drawPolygon(xstar,ystar, 10);
				
			}
		}
		//fiverow stars
		for(int q = 0; q<4; q++){
			
			for(int r = 0; r<5; r++){
				i = 0;				
				
				
				for(double j = 0; j<360; j+=36){
					
					if(i % 2 == 0){
						xstar[i] = (int)((Math.cos(Math.toRadians(j-18))*lradius)+(.63*ratio*2)+(.63*ratio*2*r));
						ystar[i] = (int)((Math.sin(Math.toRadians(j-18))*lradius)+(.54*ratio*2)+(.54*ratio*2*q));	
					}
					else{
						xstar[i] = (int)((Math.cos(Math.toRadians(j-18))*sradius)+(.63*ratio*2)+(.63*ratio*2*r));
						ystar[i] = (int)((Math.sin(Math.toRadians(j-18))*sradius)+(.54*ratio*2)+(.54*ratio*2*q));
					
					}
					i++;		
				}
				g.setColor(Color.WHITE);
				g.fillPolygon(xstar,ystar, 10);
				g.setColor(Color.BLACK);
				g.drawPolygon(xstar,ystar, 10);
				
			}
		}
	}


}
