//Recursion
import java.util.*;
class Fac_Rec
{
	static int factorial(int n)
	{
		if(n == 0|| n == 1)
			return 1;
		return n * factorial(n-1); 
	}
	public static void main(String[] args)
	{
		int num;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		System.out.println("Factorial of "+num+" is "+factorial(num));				
	}
}