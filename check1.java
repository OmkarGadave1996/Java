import java.awt.*;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Graphics.*;
import java.awt.Checkbox;
import java.applet.*;
import java.awt.event.*;
import java.awt.event.ItemEvent;
public class Check1 extends Applet implements ItemListener
{
	CheckboxGroup IngGrp = null;
	public void init()
	{
		IngGrp = new CheckboxGroup();
		Checkbox java = new Checkbox("java",IngGrp,true);
		Checkbox cpp = new Checkbox("cpp",IngGrp,true);
		Checkbox vb = new Checkbox("vb",IngGrp,true);
		add(java);
		add(cpp);
		add(vb);
		java.addItemListener(this);
		cpp.addItemListener(this);
		vb.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
}