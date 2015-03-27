import java.awt.BorderLayout;

import javax.swing.JPanel;


public class WidgetPanel extends JPanel {
	
	JPanel left, right, center;
	BorderLayout layout;

	public WidgetPanel() {
		super();
		layout = new BorderLayout();
		setLayout(layout);
		left = new JPanel();
		center = new JPanel();
		right = new JPanel();
		
		add(left,BorderLayout.WEST);
		add(center,BorderLayout.CENTER);
		add(right,BorderLayout.EAST);
		
	}
	
}
