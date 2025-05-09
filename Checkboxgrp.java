import java.awt.*;
import java.applet.*;
public class Checkboxgrp extends Applet
{
	CheckboxGroup cbg;
	public void init()
	{
		cbg=new CheckboxGroup();
		Checkbox l1=new Checkbox("C",cbg,true);
		Checkbox l2=new Checkbox("C++",cbg,true);
		Checkbox l3=new Checkbox("JAVA",cbg,true);


		add(l1);		//adding labels to applet window
		add(l2);
		add(l3);
	}
}