import java.awt.*;
import java.applet.*;
public class Checkboxes extends Applet
{
	public void init()
	{
		Checkbox l1=new Checkbox("C");
		Checkbox l2=new Checkbox("C++");
		Checkbox l3=new Checkbox("JAVA");


		add(l1);		//adding labels to applet window
		add(l2);
		add(l3);
	}
}