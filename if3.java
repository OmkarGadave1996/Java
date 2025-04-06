import java.util.*;
class if3
{
	public static void main(String[] Args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		n = sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}
}