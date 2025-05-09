//Illustration of scroll bars
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class scrollbars extends Applet implements AdjustmentListener, MouseMotionListener
{
	String msg="";
	Scrollbar vsb, hsb;
	public void init()
	{
		int width=Integer.parseInt(getParameter("width"));
		int height=Integer.parseInt(getParameter("height"));

		vsb=new Scrollbar(Scrollbar.VERTICAL,0,1,0, height);
		hsb=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0, height);

		add(vsb);
		add(hsb);

		vsb.addAdjustmentListener(this);
		hsb.addAdjustmentListener(this);
		addMouseMotionListener(this);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
		int x=me.getX();
		int y=me.getY();
		vsb.setValue(y);
		hsb.setValue(x);
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
	}
	public void paint(Graphics g)
	{
		msg="Vertical: " +vsb.getValue();
		msg+="Horizontal: "+hsb.getValue();
		g.drawString("Disha", hsb.getValue(),vsb.getValue());
	}
}