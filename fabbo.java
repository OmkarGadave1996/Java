import java.util.*;
class fabbo
{
	public static void main(String[] Args)
	{
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 1, c, i, n;
		System.out.println("Enter the Number: ");
		n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			c =a + b;
			System.out.print("\t"+c);
			a = b;
			b = c;			
		}
	}
}