import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Hector");
		
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = (int) screensize.getHeight();
		int width = (int) screensize.getWidth();
		
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(width/2, height/2);
		myFrame.setSize(200, 200);
		myFrame.setVisible(true);
	    MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
		
	}
}