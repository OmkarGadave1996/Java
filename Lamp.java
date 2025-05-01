import java.awt.*;
import java.applet.*;
public class Lamp extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillRect(100,250,125,160);
		g.drawLine(125,250,125,160);
		g.drawLine(175,250,175,160);
		g.drawArc(85,157,130,50,65,365);
		g.drawArc(85,87,130,50,62,53);
		g.drawLine(85,177,124,89);
		g.drawLine(215,177,181,89);
		g.setColor(Color.blue);
		g.fillArc(78,120,40,40,63,-174);
		g.fillOval(120,96,40,40);
		g.fillArc(173,100,40,40,110,180);		
	}
}