import java.util.*;
class forfact
{
	public static void main(String[] Args)
	{
		Scanner sc = new Scanner(System.in);
		int num, f=1, i;
		System.out.println("Enter the Number: ");
		num = sc.nextInt();
		for(i=1;i<=num;i++)
		{
			f = f * i;
		}
		System.out.println("The Factorial = "+f);
	}
}