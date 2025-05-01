import java.io.*;
class M
{
	void method() throws IOException
	{
		throw new IOException("device error");
	}
}
public class TestThrows4
{
	public static void main(String args[]) throws IOException
	{
		//declare exception	
		M m = new M();
		m.method();
		System.out.println("Normal flow...");
	}
}