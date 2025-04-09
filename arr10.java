import java.util.*;
class arr10
{
	public static void main(String[] Args)
	{
		int a[], i, j, temp;
		Scanner sc = new Scanner(System.in);
		a = new int[5];
		for(i=0;i<5;i++)
		{
			System.out.println("Enter Element in a array at "+i+" Position ");
			a[i] = sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			for(j=i+1;j<5;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("The is in Ascending Order is: ");
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}		
	}
}