import java.util.*;
class arr8
{
	public static void main(String[] Args)
	{
		int a[], i, min;
		Scanner sc = new Scanner(System.in);
		a = new int[5];
		for(i=0;i<5;i++)
		{
			System.out.println("Enter Element in a array at "+i+" Position ");
			a[i] = sc.nextInt();
		}
		min = a[0];
		for(i=0;i<5;i++)
		{
			if(a[i]<min)
			{
				min = a[i];
			}
			else
			{
				min = min;	
			}
		}
		System.out.print("The Minimum Number is: "+min);	
	}
}