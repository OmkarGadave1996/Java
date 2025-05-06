import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class List1 extends Applet implements ItemListener 
{
	List l = null;
	public void init()
	{
		l = new List(2,true);
		l.add("one");
		l.add("two");
		add(l);
		l.addItemListener(this);
	}
	public void paint(Graphics g)
	{
		int[] items = l.getSelectedIndexes();
		String msg="";
		for(int i=0;i<items.length;i++)
		{
			msg =items[i]+""+msg;
		}
		g.drawString("selected Indexes "+msg,10,20);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
}