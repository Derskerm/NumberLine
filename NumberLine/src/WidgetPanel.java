import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;


public class WidgetPanel extends JPanel {
	
	JPanel left, right, center;
	BorderLayout layout;
	JSlider slider;
	JRadioButton rad1, rad2, rad3;
	ButtonGroup group;
	JCheckBox check1, check2, check3;

	public WidgetPanel() {
		super();
		setBackground(Color.WHITE);
		
		layout = new BorderLayout();
		layout.setHgap(10);
		setLayout(layout);
		
		left = new JPanel(new GridLayout(3,1));
		left.setBorder(new EtchedBorder());
		center = new JPanel(new BorderLayout());
		center.setBorder(new EtchedBorder());
		right = new JPanel(new GridLayout(3,1));
		right.setBorder(new EtchedBorder());
		
		rad1 = new JRadioButton("Circle");
		rad1.setSelected(true);
		rad2 = new JRadioButton("Triangle");
		rad3 = new JRadioButton("Square");
		
		group = new ButtonGroup();
		group.add(rad1);
		group.add(rad2);
		group.add(rad3);
		
		check1 = new JCheckBox("Bold");
		check2 = new JCheckBox("Italic");
		check3 = new JCheckBox("Underline");
		
		slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
		slider.setMajorTickSpacing(10);
		slider.createStandardLabels(10);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		
		left.add(rad1);
		left.add(rad2);
		left.add(rad3);
		
		center.add(slider);
		
		right.add(check1);
		right.add(check2);
		right.add(check3);
		
		add(left,BorderLayout.WEST);
		add(center,BorderLayout.CENTER);
		add(right,BorderLayout.EAST);
		
		
	}
	
}
