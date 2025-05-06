import java.applet.*;
import java.awt.*;
import java.awt.Choice.*;
public class choice extends Applet
{
	Choice rgb;
	public void init()
	{
		Choice rgb = new Choice();
		rgb.add("Red");
		rgb.add("Green");
		rgb.add("Blue");
		rgb.add("Yellow");
		add(rgb);
	}
}