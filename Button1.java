import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Button1 extends Applet
{
	MyButton b1;
	static int i=0;
	public void init()
	{
		b1=new MyButton("My Button");
		add(b1);
	}
class MyButton extends Button
{
	public MyButton(String label)
	{
		super(label);
		enableEvents(AWTEvent.ACTION_EVENT_MASK);
	}
	protected void processActionEvent(ActionEvent ae)
	{
		showStatus("Action Event:"+i++);
		super.processActionEvent(ae);
	}
}
}
/*import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Button1 extends Applet {
    static int i = 0;

    public void init() {
        Button b = new Button("Click Me");
        add(b);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showStatus("Action Event: " + i++);
            }
        });
    }
}*/
