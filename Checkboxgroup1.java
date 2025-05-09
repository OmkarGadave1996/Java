//Illustration of check boxes
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Checkboxgroup1 extends Applet implements ItemListener
{
	String msg="";
	Checkbox Idea, Reliance, Airtel, Vodafone;
	CheckboxGroup cbg;
	public void init()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT));
		cbg=new CheckboxGroup();
		Idea=new Checkbox("Idea Cellular",cbg,true);
		Reliance=new Checkbox("Reliance",cbg,false);
		Airtel=new Checkbox("Airtel",cbg,false);
		Vodafone=new Checkbox("Vodafone",cbg,false);
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
	public void paint(Graphics g)
	{
		msg="Current selection:";
		msg+=cbg.getSelectedCheckbox().getLabel();
		g.drawString(msg, 6, 100);
	}
}