import java.util.*;
class Calculation
{
	void fact(int n)
	{
		int fact = 1;
		for(int i=1;i<=n;i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial is: "+fact);
	}
	public static void main(String Args[])
	{
		new Calculation().fact(5); //Calling Method with anonymousm object
	}
}