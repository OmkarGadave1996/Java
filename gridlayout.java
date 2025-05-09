//Demonstrate GridLayout.
import java.awt.*;
import java.applet.*;
public class gridlayout extends Applet
{
	int n=1;
	public void init()
	{
		setLayout(new GridLayout(4, 4));
		setFont(new Font("SansSenf", Font.BOLD, 24));
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				add(new Button(""+n));
				n++;
			}
		}
	}
}