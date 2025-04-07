class dowhiletable
{
	public static void main(String[] Args)
	{
		int i = 1,j;
		do
		{
			j = 1;
			do
			{			
				System.out.print("\t"+i*j);
				j++;
			}
			while(j<=10);
			System.out.println();
			i++;
		}
		while(i<=10);
	}
}