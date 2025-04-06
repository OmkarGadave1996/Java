import java.util.*;
class if2
{
	public static void main(String[] Args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		n = sc.nextInt();
		if(n>=0)
		{
			System.out.println("Positive Number");
		}
		else
		{
			System.out.println("Negative Number");
		}
	}
}