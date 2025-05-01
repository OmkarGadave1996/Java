import java.awt.*;
import java.applet.*;
public class AppletDemo extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Hello World",30,30);
		g.drawString("Hello World",40,60);
		g.drawString("Hello World",50,90);
	}
}