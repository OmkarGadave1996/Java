import java.awt.*;
import java.awt.event.*;
class AEvent2 extends Frame
{
	TextField tf;
	AEvent2()
	{
		//Create components
		tf = new TextField();
		tf.setBounds(60,50,170,20);
		Button b = new Button("Click Me!!");
		b.setBounds(50,120,80,30);
		//Register listener
		Outer o = new Outer(this);
		b.addActionListener(o);//passing outer class instance
		//add components and set size, layout and visiblity
		add(b);
		add(tf);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new AEvent2();
	} 
}