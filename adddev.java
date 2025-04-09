import java.util.*;
class arrdev2D
{
	public static void main(String[] Args)
	{
		int a[][],b[][],c[][], i, j;
		Scanner sc = new Scanner(System.in);
		a = new int[2][3];
		b = new int[2][3];
		c = new int[2][3];
		System.out.println("Enter the A's 2D array Element: ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the B's 2D array Element: ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("The A's 2D array Matrix: ");		
		for(i=0;i<2;i++)
		{		
			for(j=0;j<3;j++)
			{
				System.out.print(+a[i][j]+"\t");
			}
			System.out.println("");	
		}
		System.out.println("The B's 2D array Matrix: ");		
		for(i=0;i<2;i++)
		{		
			for(j=0;j<3;j++)
			{
				System.out.print(+b[i][j]+"\t");
			}
			System.out.println("");	
		}
		System.out.println("The Division A & B 2D Array Matrix: ");		
		for(i=0;i<2;i++)
		{		
			for(j=0;j<3;j++)
			{
				c[i][j] = a[i][j] / b[i][j];
				System.out.print(+c[i][j]+"\t");
			}
			System.out.println("");	
		}
	}
}