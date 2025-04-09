import java.util.*;
class arr7
{
	public static void main(String[] Args)
	{
		int a[], i, max=0;
		Scanner sc = new Scanner(System.in);
		a = new int[5];
		for(i=0;i<5;i++)
		{
			System.out.println("Enter Element in a array at "+i+" Position ");
			a[i] = sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
			else
			{
				max = max;	
			}
		}
		System.out.print("The Maximum Number is: "+max);	
	}
}