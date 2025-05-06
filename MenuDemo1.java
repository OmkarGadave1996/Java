import java.awt.*;
import java.applet.*;
import java.awt.MenuBar;
public class MenuDemo1 extends Frame
{
	MenuDemo1()
	{
		Frame f = new Frame();
		MenuDemo m = new MenuDemo();
		f.setVisible(true);
		MenuBar mbar = new MenuBar();
		f.setMenuBar(mbar);
		Menu FileMenu = new Menu("File");
		Menu EditMenu = new Menu("Edit");
		mbar.add(FileMenu);
		mbar.add(EditMenu);
		MenuItem new1 = new MenuItem("New");
		MenuItem open1 = new MenuItem("Open");	
		FileMenu.add(new1);
		EditMenu.add(open1);	
		f.setSize(400,300);
		f.setTitle("Menu");
		f.setLayout(null);
	}
	public static void main(String[] args)
	{
		new MenuDemo1();
	}
}