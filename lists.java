//Examples of lists.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class lists extends Applet implements ActionListener
{
	List cellphones, companies;
	String msg="";
	public void init()
	{
		cellphones=new List(4, true);
		companies=new List(4, false);
		cellphones.add("Nokia");
		
		
		cellphones.add("Samsung");
		cellphones.add("BlackBerry");
		cellphones.add("Sony Ericson");

		companies.add("BSNL");
		companies.add("IDEA Cellular");
		companies.add("Airtel");
		companies.add("Aircel");
		companies.add("Reliance communication");
		companies.add("TATA DOCOMO");
		companies.add("Vodafone");

		companies.add("Orange");
		companies.select(1);

		add(cellphones);
		add(companies);

		cellphones.addActionListener(this);
		companies.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		int idx[];
		msg="Current.cellphones:";
		idx=cellphones.getSelectedIndexes();
		for(int i=0;i<idx.length;i++)
		msg+=cellphones.getItem(idx[i])+" ";
		g.drawString(msg, 6, 120);
		msg="Current Companies:";
		msg+=companies.getSelectedItem();
		g.drawString(msg, 6, 140);
	}
}