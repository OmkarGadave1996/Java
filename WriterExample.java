import java.io.*;
public class WriterExample
{
	public static void main(String[] args)
	{
		try
		{
			Writer w = new FileWriter("disha.txt");
			String content = "I love my Country";
			w.write(content);
			w.close();
			System.out.println("Done");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}