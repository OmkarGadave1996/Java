import java.util.*;
class arr1
{
	public static void main(String[] Args)
	{
		int a[], i;
		Scanner sc = new Scanner(System.in);
		a = new int[5];
		for(i=0;i<5;i++)
		{
			System.out.println("Enter Element in a array at "+i+" Position ");
			a[i] = sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			System.out.println("The Element at "+i+" Position is "+a[i]);
		}	
	}
}