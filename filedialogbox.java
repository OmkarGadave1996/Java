//Demonstrate File Dialog box.
import java.awt.*;
import java.awt.event.*;
class DialogFrame extends Frame
{
	DialogFrame(String title)
	{
		super(title);
		MyWindowAdapter adapter=new MyWindowAdapter(this);
		
		addWindowListener(adapter);
	}
}
class MyWindowAdapter extends WindowAdapter
{
	DialogFrame DialogFrame;
	public MyWindowAdapter(DialogFrame DialogFrame)
	{
		this.DialogFrame=DialogFrame;
	}
	public void windowClosing(WindowEvent we)
	{
		DialogFrame.setVisible(false);
	}
}
class filedialogbox
{
	public static void main(String args[])
	{
		Frame f=new DialogFrame("File Dialog Frame");
		f.setVisible(true);
		f.setSize(100, 100);
		FileDialog fd= new FileDialog(f, "File Dialog box");
		fd.setVisible(true);
	}
}