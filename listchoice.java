//Examples Choice lists.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class listchoice extends Applet implements ItemListener
{
	Choice stations;
	String msg="";
	public void init()
	{
		stations=new Choice();

		//add items to station list
		stations.add("FM Radio");
		stations.add("AllIndia Radio");
		stations.add("Radio Mirchi");
		stations.add("Red FM");

		add(stations);
		stations.addItemListener(this);
	
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg="Current stations:";
		msg+=stations.getSelectedItem();
		g.drawString(msg, 6, 120);
	}
}