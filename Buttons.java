import java.awt.*;
import java.applet.*;
public class Buttons extends Applet
{
	public void init()
	{
		Button l1=new Button("Clear");
		Button l2=new Button("Submit");
		Button l3=new Button("Ok");


		add(l1);		//adding labels to applet window
		add(l2);
		add(l3);
	}
}