public class TryCatchExample5
{
	public static void main(String[] args)
	{
		try
		{
			int data = 50/0; //may throw exception
		}
		//handling the exception
		catch(ArithmeticException e)
		{
			//displaying the custom message
			System.out.println("Can't divided by zero");
		}
	}
}