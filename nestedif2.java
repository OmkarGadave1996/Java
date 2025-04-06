import java.util.*;
class nestedif2
{
	public static void main(String[] Args)
	{
		int a,w;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age and Weight: ");
		a = sc.nextInt();
		if(a>=18)
		{
			w = sc.nextInt();
			if(w>=50)
			{	
				System.out.println("Eligible for Blood Donation");
			}
			else
			{
				System.out.println("Not eligible for Blood Donation");				
			}
		}
		else
		{
			System.out.println("Not eligible for Blood Donation");				
		}
	}
}