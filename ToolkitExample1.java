import java.awt.event.*;  
import java.awt.*;
public class ToolkitExample1 
{  
	public static void main(String[] args) 
	{  
    		Frame f=new Frame("ToolkitExample1");  
		Button b=new Button("beep");  
    		b.setBounds(50,100,60,30);  
    		f.add(b);     
    		f.setSize(300,300);  
    		f.setLayout(null);  
    		f.setVisible(true);  
    		b.addActionListener(new ActionListener()
		{  
        		public void actionPerformed(ActionEvent e)
			{  
            			Toolkit.getDefaultToolkit().beep();  
        		}  
    		});       
	}  
}  