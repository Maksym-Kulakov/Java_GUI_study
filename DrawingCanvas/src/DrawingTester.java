import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;





public class DrawingTester {

	public static void main(String[] args) {
		
	
	int w = 640;
	int h = 480;
	DrawingCanvas dc = new DrawingCanvas(w, h);
	
	JFrame jfm = new JFrame();
	
	jfm.setSize(w, h);
	jfm.setTitle("drwg");
	jfm.add(dc);
	jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jfm.setVisible(true);
	
	}
}
