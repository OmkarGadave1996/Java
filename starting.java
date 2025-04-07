import java.util.*;
class starting
{
	public static void main(String[] Args)
	{
		int i,s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting Number : ");
		s = sc.nextInt();
		i = s;
		while(i<=50)
		{
			System.out.println(i);
			i++;
		}
	}
}