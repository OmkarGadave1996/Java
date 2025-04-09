import java.util.*;
class arr5
{
	public static void main(String[] Args)
	{
		int a[],b[],c[],i;
		Scanner sc = new Scanner(System.in);
		a = new int[5];
		b = new int[5];
		c = new int[5];
		for(i=0;i<5;i++)
		{
			System.out.println("Enter Element in a array at "+i+" Position ");
			a[i] = sc.nextInt();
			System.out.println("Enter Element in b array at "+i+" Position ");
			b[i] = sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			c[i] = b[i] * a[i];
			System.out.println(a[i]+" * "+b[i]+" = "+c[i]);
		}	
	}
}