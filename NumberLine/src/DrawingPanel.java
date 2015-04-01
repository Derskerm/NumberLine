import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class DrawingPanel extends JPanel {
	// TODO Your Instance Variables Here

	final int absoluteWidth;
	Font font;
	
	public DrawingPanel() {
		super();
		setBackground(Color.WHITE);
		absoluteWidth = 640;
		font = new Font("Sans Serif",Font.BOLD,16);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g); // Call JPanel's paintComponent method
									// to paint the background

		int width = getWidth();
		double scale = (double)width/absoluteWidth;
		
		g.setColor(Color.CYAN);
		g.fillRect((int)(64 * scale), 95, (int)((absoluteWidth - 128)*scale), 10);
		g.setColor(Color.BLACK);
		g.drawLine((int)(64 * scale), 100, (int)((absoluteWidth - 64)*scale), 100);
		g.setFont(font);
		FontMetrics fm = g.getFontMetrics();
		
		for (int i = 0; i <= 10; i++) {
			g.drawLine((int)((64 + (int)(51.2*i)) * scale), 90, (int)((64 + (int)(51.2*i)) * scale), 110);
			width = fm.stringWidth(i*10 + "");
			g.drawString(i*10 + "", (int)((64 + (int)(51.2*i)) * scale) - width/2, 70);
		}
		
		// TODO Draw on the panel here
	}

	
	
}
