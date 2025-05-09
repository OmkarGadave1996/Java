//Illustrating TextArea.
import java.awt.*;
import java.applet.*;
public class textarea extends Applet
{
	public void init()
	{
		String strng="Advanced java is a superb software tool"+
		"because of AWT features:\n"+
		"It is rich of multiple constrols which helps a lot \n"+
		"for designing user interfaces:\n"+
		"Controls like push buttons, checkboxes, lists etc. are \n"+
		"very effective and useful..\n"+
		"Swing is also one of its features.\n\n"+
		"tabbed controls, tree like structures etc.\n"+
		"The servlets are amazing part of Advanced java.\n"+
		"JDBC-ODBC is also one of the powerful tools of the java.\n\n"+
		"There are many more things in java which makes it outstanding";
		
		TextArea ta=new TextArea(strng, 10,20 );
		add(ta);
	}
}