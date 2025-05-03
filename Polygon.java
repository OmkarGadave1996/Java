import java.awt.*;
import java.applet.*;
public class Polygon extends Applet
{
	public void paint(Graphics g)
	{
		int xpoint[] = {30,200,30,200,30};
		int ypoint[] = {30,30,200,200,30};
		int num = 5;
		g.drawPolygon(xpoint,ypoint,num);
	}
}