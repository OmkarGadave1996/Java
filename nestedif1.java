import java.util.*;
class nestedif1
{
	public static void main(String[] Args)
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three Numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{	
				System.out.println("A is Greater");
			}
			else
			{
				System.out.println("B is Greater");				
			}
		}
		else
		{
			if(b>c)
			{	
				System.out.println("B is Greater");
			}
			else
			{
				System.out.println("C is Greater");				
			}
		}
	}
}