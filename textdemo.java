import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class textdemo extends Applet
{
	TextField name,passwd;
	public void init()
	{
		Label n = new Label("Name",Label.RIGHT);
		Label p = new Label("Password",Label.RIGHT);
		name = new TextField(15);
		passwd = new TextField(5);
		add(n);	
		add(name);	
		add(p);	
		add(passwd);		
	}
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("Name"+name.getText(),10,80);
	}
}