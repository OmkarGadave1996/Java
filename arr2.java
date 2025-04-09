import java.util.*;
class arr2
{
	public static void main(String[] Args)
	{
		int a[],b[],i;
		Scanner sc = new Scanner(System.in);
		a = new int[5];
		b = new int[5];
		for(i=0;i<5;i++)
		{
			System.out.println("Enter Element in a array at "+i+" Position ");
			a[i] = sc.nextInt();
		}
		System.out.println("Element of a\tElement of b");
		for(i=0;i<5;i++)
		{
			b[i] = a[i];
			System.out.println(a[i]+"\t\t"+b[i]);
		}	
	}
}