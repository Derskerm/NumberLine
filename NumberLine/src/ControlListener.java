
public interface ControlListener {
	
	public static final int SQUARE = 0;
	public static final int TRIANGLE = 1;
	public static final int CIRCLE = 2;
	
	void changeShape(int shape);
	void moveSlider(int num);
	void setFont(boolean bold, boolean italics, boolean underlined);
}
