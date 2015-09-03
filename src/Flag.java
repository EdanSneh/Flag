import java.awt.*;
import javax.swing.JFrame;
import java.math.*;

public class Flag extends JFrame {
	
	
	
	public Flag () {
		init();
		final FlagC flag1 = new FlagC();
		this.add(flag1, BorderLayout.CENTER);
	}
	
	public void init() {
		
		
		setSize(1000, 1000);
		setBackground(Color.WHITE);
		repaint();
		//hi
		
	}
}