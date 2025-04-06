import java.util.*;
class eligible
{
	public static void main(String[] Args)
	{
		int y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		y = sc.nextInt();
		if(y>=18)
		{
			System.out.println("Eligible For Voting");
		}
		else
		{
			System.out.println("Not Eligible for Voting");
		}
	}
}