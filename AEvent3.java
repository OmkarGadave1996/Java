import java.awt.*;
import java.awt.event.*;
class AEvent3 extends Frame
{
	TextField tf;
	AEvent3()
	{
		tf = new TextField();
		tf.setBounds(60,50,170,20);
		Button b = new Button("Click Me!!");
		b.setBounds(50,120,80,30);
		
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				tf.setText("Hello!!");
			}
		});
		add(b);
		add(tf);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new AEvent3();
	} 
}