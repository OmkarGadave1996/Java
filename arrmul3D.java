import java.util.*;
class arrmul3D
{
	public static void main(String[] Args)
	{
		Scanner sc = new Scanner(System.in);
		int a[][][],b[][][],c[][][],i,j,k;
		a = new int[2][2][3];
		b = new int[2][2][3];
		c = new int[2][2][3];
		System.out.println("Enter Elements of 3D Array A: ");
		for(k=0;k<2;k++)
		{
			for(i=0;i<2;i++)
			{
				for(j=0;j<3;j++)
				{
					a[k][i][j] = sc.nextInt();
				}
			}
		}
		System.out.println("Enter Elements of 3D Array B: ");
		for(k=0;k<2;k++)
		{
			for(i=0;i<2;i++)
			{
				for(j=0;j<3;j++)
				{
					b[k][i][j] = sc.nextInt();
				}
			}
		}
		System.out.println("Elements of 3D Matrices of A: ");
		for(k=0;k<2;k++)
		{
			for(i=0;i<2;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.print(a[k][i][j]+"\t");
				}
				System.out.println("");
			}
			System.out.println("-------------------------------");			
		}
		System.out.println("Elements of 3D Matrices of B: ");
		for(k=0;k<2;k++)
		{
			for(i=0;i<2;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.print(b[k][i][j]+"\t");
				}
				System.out.println("");
			}
			System.out.println("-------------------------------");			
		}
		System.out.println("Multiplication of 3D Matrices: ");
		for(k=0;k<2;k++)
		{
			for(i=0;i<2;i++)
			{
				for(j=0;j<3;j++)
				{
					c[k][i][j] = a[k][i][j] * b[k][i][j];
					System.out.print(c[k][i][j]+"\t");
				}
				System.out.println("");
			}
			System.out.println("-------------------------------");			
		}
	}
}