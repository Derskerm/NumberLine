import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import javax.swing.JFrame;


public class NumberLineFrame extends JFrame {
	
	public NumberLineFrame() {
		w.setBounds(100, 100, 640, 480);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DrawingPanel panel = new DrawingPanel();
		
		
		
		w.add(panel);
		w.setResizable(true);
	}
	
	

}
