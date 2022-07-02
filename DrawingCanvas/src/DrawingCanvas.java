import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;



public class DrawingCanvas extends JComponent{

	private int width;
	private int height;
	private Cload cload1;
	private Cload cload2;
	private Cload cload3;
	
	DrawingCanvas(int w, int h){ 
		width = w;
		height = h;
		cload1 = new Cload(10, 10, Color.BLUE);
		cload2 = new Cload(100, 10, Color.BLACK);
		cload3 = new Cload(10, 100, Color.GREEN);
	}
	
	@Override
	protected void paintComponent (Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		
		RenderingHints rh = new RenderingHints(
				RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		
		g2d.setRenderingHints(rh);		
				
		
		
		
		Rectangle2D.Double r = new Rectangle2D.Double(0, 0, width, height);
		g2d.setColor(new Color(100, 149, 239));
		g2d.fill(r);
		
		Line2D.Double l = new Line2D.Double(0, 0, width, height);
		g2d.setColor(Color.BLACK);
		g2d.draw(l);
		
	
		cload1.drawCload(g2d);
		cload2.drawCload(g2d);
		cload3.drawCload(g2d);
		
	}
	
}
