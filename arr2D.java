import java.util.*;
class arr2D
{
	public static void main(String[] Args)
	{
		int a[][], i, j;
		Scanner sc = new Scanner(System.in);
		a = new int[2][3];
		System.out.println("Enter the 2D array Element   ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("The 2D array Matrix: ");		
		for(i=0;i<2;i++)
		{		
			for(j=0;j<3;j++)
			{
				System.out.print(+a[i][j]+"\t");
			}
			System.out.println("");	
		}
	}
}