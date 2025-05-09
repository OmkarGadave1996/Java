//Demonstrating Buttons
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Buttons1 extends Applet implements ActionListener
{
	String msg="";
	Button add, modify, delete;
	public void init()
	{
		add=new Button("Add");
		modify=new Button("Modify");
		delete=new Button("delete");
		add(add);
		add(modify);
		add(delete);
		add.addActionListener(this);
		modify.addActionListener(this);
		delete.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
{
	String str=ae.getActionCommand();
	if(str.equals("Add"))
	{
		msg="You pressed add.";
	}
	else if(str.equals("Modify"))
	{
		msg="You pressed modify.";
	}
	else
	{
	msg="You pressed Delete.";
	}
	repaint();
}
public void paint(Graphics g)
{
g.drawString(msg, 6, 100);
}
}