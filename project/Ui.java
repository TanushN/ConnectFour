package project;
import javax.swing.JFrame;
public class Ui {
    JFrame frame;
	public Ui() {
		
		
		displayboard();
		
	}
	public void displayboard() {
		frame = new JFrame("Example");
		frame.setSize(650, 650);
		frame.setVisible(true);
	}
	
	
	
}
