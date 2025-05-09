import java.awt.*;
import java.applet.*;
public class Labels extends Applet
{
	public void init()
	{
		Label l1=new Label("First name");
		Label l2=new Label("Middle name");
		Label l3=new Label("Last name");


		add(l1);		//adding labels to applet window
		add(l2);
		add(l3);
	}
}