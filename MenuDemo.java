import java.awt.*;
import java.applet.*;
import java.awt.MenuBar;
public class MenuDemo extends Frame
{
	public static void main(String[] args)
	{
		MenuDemo m = new MenuDemo();
		m.setVisible(true);
		MenuBar mbar = new MenuBar();
		m.setMenuBar(mbar);
		Menu FileMenu = new Menu("File");
		Menu EditMenu = new Menu("Edit");
		mbar.add(FileMenu);
		mbar.add(EditMenu);
		MenuItem new1 = new MenuItem("New");
		MenuItem open1 = new MenuItem("Open");	
		FileMenu.add(new1);
		EditMenu.add(open1);	
	}
}