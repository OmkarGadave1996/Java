//Demonstrate check boxes.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Checkboxes1 extends Applet implements ItemListener
{
	String msg="";
	Checkbox Idea, Reliance, Airtel, Vodafone;
	public void init()
	{
		Idea=new Checkbox("Idea Cellular",null,true);
		Reliance=new Checkbox("Reliance");
		Airtel=new Checkbox("Airtel");
		Vodafone=new Checkbox("Vodafone");
		add(Idea);
		add(Reliance);
		add(Airtel);
		add(Vodafone);
		Idea.addItemListener(this);
		Reliance.addItemListener(this);
		Airtel.addItemListener(this);
		Vodafone.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)	//Display current state of the checkboxes.
	{
		msg="Current state:";
		g.drawString(msg,6,80);
		msg="Idea Cellular:"+Idea.getState();
		g.drawString(msg,6,100);
		msg="Reliance:"+Reliance.getState();
		g.drawString(msg,6,120);
		msg="Airtel:"+Airtel.getState();
		g.drawString(msg,6,140);
		msg="Vodafone:"+Vodafone.getState();
		g.drawString(msg,6,160);
	}
}
	