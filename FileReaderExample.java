import java.io.FileReader;
public class FileReaderExample
{
	public static void main(String[] args) throws Exception
	{	
		//or
		//try
		//{
			FileReader fr = new FileReader("disha.txt");
			int i = 0;
			while((i=fr.read()) != -1)
				System.out.print((char)i);
			fr.close();
		//}	
		//catch (Exception ex)
		//{
		//	System.out.println(ex.getMessage());
		//}
	}
}