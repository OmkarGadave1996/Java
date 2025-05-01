import java.awt.*;
import java.applet.*;
public class Ellipse extends Applet
{
	public void paint(Graphics g)
	{
		g.fillOval(10,10,75,50);
		g.drawOval(190,10,90,30);
		g.fillOval(70,90,140,100);
	}
}