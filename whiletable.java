class whiletable
{
	public static void main(String[] Args)
	{
		int i = 1,j;
		while(i<=10)
		{
			j = 1;
			while(j<=10)
			{			
				System.out.print("\t"+i*j);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}