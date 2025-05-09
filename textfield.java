//Demonstrate text field.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class textfield extends Applet implements ActionListener
{
	TextField nm, psw;
	public void init()
	{
		Label nml=new Label("name:", Label.RIGHT);
		Label pswl=new Label("Password:", Label.RIGHT);
		nm=new TextField(12);
		psw=new TextField(8);
		psw.setEchoChar('*');

		add(nml);
		add(nm);
		add(pswl);
		add(psw);

		nm.addActionListener(this);
		psw.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("name: "+nm.getText(), 6, 60);
		//g.drawString("Selected text in name: "+nm.getSelectedText(), 6, 80);
	}
}