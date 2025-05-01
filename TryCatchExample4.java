public class TryCatchExample4
{
	public static void main(String[] args)
	{
		try
		{
			int data = 50/0; //may throw exception
		}
		//handling the exception by using Exception class
		catch(ArithmeticException e)
		{
			System.out.println("divisible by zero");
		}
		System.out.println("rest of the code"); 
	}
}