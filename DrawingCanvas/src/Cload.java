import java.awt.*;
import java.awt.geom.*;





public class Cload {

	private Color color;
	private double x;
	private double y;
	
	public Cload(double x, double y, Color color)
	{
	this.x = x;
	this.y = y;
	this.color = color;	
	}
	
	public void drawCload(Graphics2D g2d) {
		
		Ellipse2D.Double e = new Ellipse2D.Double(x, y, 100, 100);
		g2d.setColor(Color.BLUE);
		g2d.fill(e);
		Ellipse2D.Double e1 = new Ellipse2D.Double(x+100, y+100, 100, 100);
		g2d.setColor(Color.BLUE);
		g2d.fill(e1);
		Ellipse2D.Double e2 = new Ellipse2D.Double(350, 90, 90, 90);
		g2d.setColor(Color.BLUE);
		g2d.fill(e2);
		Ellipse2D.Double e3 = new Ellipse2D.Double(380, 80, 30, 30);
		g2d.setColor(Color.BLUE);
		g2d.fill(e3);
		
	}
	
	
}
