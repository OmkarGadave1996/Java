// Example of BorderLayout.
import java.awt.*;
import java.applet.*;
import java.util.*;
public class borderlayout extends Applet
{
	public void init()
	{
		setLayout(new BorderLayout());
		add(new Button("Top Region."),BorderLayout.NORTH);
		add(new Button("Bottom Region."),BorderLayout.SOUTH);
		
		String msg="The Border Layout is"+"Wonderful because of different regions\n"+
		"This has made it very flexible to use it.\n"+
		"It specifies different borders in the window.\n"+
		"It also identifies the center of the window.";
		add(new TextArea(msg), BorderLayout.CENTER);
	}
}