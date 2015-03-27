import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class DrawingPanel extends JPanel{
	// TODO Your Instance Variables Here

	final int absoluteHeight, absoluteWidth;
	
	public DrawingPanel() {
		super();
		setBackground(Color.WHITE);
		absoluteHeight = getHeight();
		absoluteWidth = getWidth();
		// TODO Add GUI customizations to the panel
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g); // Call JPanel's paintComponent method
									// to paint the background

		int width = getWidth();
		int height = getHeight();
		
		g.drawLine()
		
		// TODO Draw on the panel here
	}

}
