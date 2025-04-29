import java.io.FileWriter;
public class FileWriterExample
{
	public static void main(String[] args)
	{
		try
		{
			FileWriter fw = new FileWriter("disha.txt");
			String s = "Best things in world are free";
			fw.write(s);
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Success...");
	}
}