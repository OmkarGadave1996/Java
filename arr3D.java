import java.util.*;
class arr3D
{
	public static void main(String[] Args)
	{
		Scanner sc = new Scanner(System.in);
		int a[][][],i,j,k;
		a = new int[2][2][3];
		System.out.println("Enter Elements of 3D Array: ");
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
		System.out.println("Elements of 3D Matrices: ");
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
	}
}